package com.first.leetcode;

/**
 * 买卖股票的最佳时机
 * Created by zhangwei03 on 2019/12/11.
 */
public class Solution121 {

    public static int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int price:prices){
           if(price<minPrice){
               minPrice=price;
           }else {
               maxPrice=Math.max(price-minPrice,maxPrice);
           }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}

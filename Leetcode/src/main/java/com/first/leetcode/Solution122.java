package com.first.leetcode;

/**
 * 买卖股票的最佳时机II
 * Created by zhangwei03 on 2019/12/17.
 */
public class Solution122 {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
             if(prices[i+1]>prices[i]){
                 maxProfit=maxProfit+prices[i+1]-prices[i];
             }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }

}

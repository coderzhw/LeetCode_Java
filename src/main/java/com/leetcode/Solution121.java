package com.leetcode;

/**
 * 买卖股票的最佳时机
 */
public class Solution121 {

    public int maxProfit(int[] prices) {

        int min = prices[0];
        int result = 0;

        for (int i = 1; i < prices.length; i++) {
            min = Math.min(prices[i], min);
            result = Math.max(prices[i] - min, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={7,1,5,3,6,4};
        System.out.println(new Solution121().maxProfit(nums));
    }

}

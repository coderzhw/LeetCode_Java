package com.leetcode;

/**
 * 买卖股票的最佳时机 III
 */
public class Solution123 {

    public int maxProfit(int[] prices) {

        int len = prices.length;

        //定义5种状态
        int[][] dp = new int[len][5];

        dp[0][1] = -prices[0];
        dp[0][3] = -prices[0];

        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i - 1][0];
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
            dp[i][2] = Math.max(dp[i - 1][1] + prices[i], dp[i - 1][2]);
            dp[i][3] = Math.max(dp[i - 1][2] - prices[i], dp[i - 1][3]);
            dp[i][4] = Math.max(dp[i - 1][3] + prices[i], dp[i - 1][4]);
        }
        return dp[len - 1][4];
    }


    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(new Solution123().maxProfit(prices));
    }


}

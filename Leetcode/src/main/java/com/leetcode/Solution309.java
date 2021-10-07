package com.leetcode;

/**
 * 最佳买卖股票时机含冷冻期
 */
public class Solution309 {

    public int maxProfit(int[] prices) {
        int len = prices.length;

        int[][] dp = new int[len][4];

        dp[0][0] = 0; //不持有股票，今天没卖
        dp[0][1]=0;//不持股，今天卖出
        dp[0][2]=-prices[0];// 持有股票,今天买入
        dp[0][3]=-prices[0];//持有股票,非今天买入

        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = Math.max(dp[i - 1][2], dp[i - 1][3])+prices[i];
            dp[i][2] = dp[i - 1][0] - prices[i];
            dp[i][3] = Math.max(dp[i-1][2],dp[i-1][3]);
        }

        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }

    public static void main(String[] args) {
        int[] prices = {1, 2, 3, 0, 2};
        System.out.println(new Solution309().maxProfit(prices));
    }
}

package com.leetcode;

/**
 * 买卖股票的最佳时机含手续费
 */
public class Solution714 {

    public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = -prices[0];//0表示持股
        dp[0][1] = 0;//1表示不持股
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + prices[i] - fee);
        }
        return Math.max(dp[len - 1][0], dp[len - 1][1]);
    }

    public static void main(String[] args) {
        int[] price = {1, 3, 2, 8, 4, 9};
        int fee = 2;
        System.out.println(new Solution714().maxProfit(price, fee));
    }
}

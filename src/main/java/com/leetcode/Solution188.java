package com.leetcode;

/**
 * 买卖股票的最佳时机 IV
 */
public class Solution188 {

    public int maxProfit(int k, int[] prices) {
        int len = prices.length;
        if(len==0) return 0;
        int[][] dp = new int[len][2 * k + 1];
        //初始化
        for (int i = 0; i < 2 * k + 1; i++) {
            if (i % 2 == 1) {
                dp[0][i] = -prices[0];
            }
        }
        for (int i = 1; i < len; i++) {
            for (int j = 1; j <= k; j++) {
                dp[i][2 * j - 1] = Math.max(dp[i - 1][2 * j - 2] - prices[i], dp[i - 1][2 * j - 1]);
                dp[i][2 * j] = Math.max(dp[i - 1][2 * j - 1] + prices[i], dp[i - 1][2 * j]);
            }
        }
        return dp[len - 1][2 * k];
    }


    public static void main(String[] args) {
        int k = 2;
        int[] prices = {1,2,3,4,5};
        System.out.println(new Solution188().maxProfit(k, prices));
    }
}

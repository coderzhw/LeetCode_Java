package com.leetcode;

/**
 * @author : zhangwei
 * @description : 完全平方数
 * @date: 2021-09-23 16:51
 */

public class Solution279 {


    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(new Solution279().numSquares(n));
    }

}

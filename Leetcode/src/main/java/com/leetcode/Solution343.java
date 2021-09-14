package com.leetcode;

/**
 * @author : zhangwei
 * @description : 整数拆分
 * @date: 2021-09-14 14:38
 */

public class Solution343 {


    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                dp[i] = Math.max(dp[i], Math.max((i - j) * j, dp[i - j] * j));
            }

        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(new Solution343().integerBreak(10));
    }

}

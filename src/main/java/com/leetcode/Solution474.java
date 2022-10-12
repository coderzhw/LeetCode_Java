package com.leetcode;

/**
 * @author : zhangwei
 * @description : 一和零
 * @date: 2021-09-18 15:46
 */

public class Solution474 {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int zero, one;
            zero = one = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    zero++;
                }
                if (str.charAt(i) == '1') {
                    one++;
                }
            }
            for (int i = m; i >= zero; i--) {
                for (int j = n; j >= one; j--) {
                    dp[i][j] = Math.max(dp[i - zero][j - one] + 1, dp[i][j]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String[] strs = {"10", "0001", "111001", "1", "0"};
        int m = 5, n = 3;
        System.out.println(new Solution474().findMaxForm(strs, m, n));
    }
}

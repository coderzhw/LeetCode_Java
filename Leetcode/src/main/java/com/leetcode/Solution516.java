package com.leetcode;


/**
 * 最长回文子序列
 */
public class Solution516 {

    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int[][] dp = new int[len + 1][len + 1];
        //这里这个初始化是如何想到的呢？
        for (int i = 0; i <= len; i++) {
            dp[i][i] = 1;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = i + 1; j < len; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][len - 1];
    }

    public static void main(String[] args) {
        String s = "bbbab";
        System.out.println(new Solution516().longestPalindromeSubseq(s));
    }

}

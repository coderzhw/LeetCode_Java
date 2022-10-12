package com.leetcode;


/**
 * 不同的子序列
 */
public class Solution115 {

    public int numDistinct(String s, String t) {

        int lens = s.length();
        int lent = t.length();
        int[][] dp = new int[lens + 1][lent + 1];
        //初始化
        for (int i = 0; i < lens; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= lens; i++) {
            for (int j = 1; j <= lent; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }

        }
        return dp[lens][lent];
    }

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(new Solution115().numDistinct(s, t));
    }


}

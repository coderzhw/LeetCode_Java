package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最长回文子串
 * @date: 2021-11-30 09:29
 */

public class Solution5 {


    public String longestPalindrome(String s) {
        int len = s.length();
        char[] arr = s.toCharArray();
        boolean dp[][] = new boolean[len][len];
        int begin = 0;
        int end = 0;
        int maxLength = 0;
        //要注意这里的遍历顺序，为什么会这样？是根据递推公式来决定的顺序
        //dp[i][j]左闭右闭区间，代表i到j的字符串
        for (int i = len - 1; i >= 0; i--) {
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j] && (j - i <= 1 || dp[i + 1][j - 1] == true)) {
                    dp[i][j] = true;
                }
                if (dp[i][j] && (j - i + 1 > maxLength)) {
                    begin = i;
                    end = j;
                    maxLength = j - i + 1;
                }
            }
        }
        return s.substring(begin, end + 1);
    }

    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(new Solution5().longestPalindrome(s));
    }


}

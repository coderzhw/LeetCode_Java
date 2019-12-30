package com.first.leetcode;

/**
 * 判断子序列
 */
public class Solution392 {

    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length()) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }

}

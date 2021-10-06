package com.leetcode;

/**
 * 回文子串
 */
public class Solution647 {

    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += extend(s, i, i);
            result += extend(s, i, i + 1);
        }
        return result;
    }


    public int extend(String s, int i, int j) {
        int result = 0;
        while (i >= 0 && i < s.length() && j >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println(new Solution647().countSubstrings(s));
    }

}

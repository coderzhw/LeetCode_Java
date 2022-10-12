package com.leetcode;

/**
 * 判断子序列
 */
public class Solution392 {

    public boolean isSubsequence(String s, String t) {

        int lens = s.length();
        int lent = t.length();

        int i = 0;
        int j = 0;
        int count = 0;
        while (i < lens && j < lent) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
                count++;
            } else {
                j++;
            }
        }
        return count == lens;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(new Solution392().isSubsequence(s, t));
    }

}

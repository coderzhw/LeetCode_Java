package com.first.leetcode;

/**
 * 找不同
 */
public class Solution389 {

    public static char findTheDifference(String s, String t) {
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < t.length(); j++) {
            if (a[t.charAt(j) - 'a'] == 0) {
                return t.charAt(j);
            } else {
                a[t.charAt(j) - 'a']--;
            }
        }
        return 0;
    }


    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd","abcde"));
    }
}

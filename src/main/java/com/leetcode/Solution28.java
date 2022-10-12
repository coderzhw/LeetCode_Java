package com.leetcode;


/**
 * 实现 strStr()
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        int i, j;
        i = j = 0;
        while (i < hlen && j < nlen) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == nlen) {
            return i - j;
        }
        return -1;
    }


    public static void main(String[] args) {

        String haystack = "111";
        String needle = "";

        System.out.println(new Solution28().strStr(haystack, needle));


    }


}

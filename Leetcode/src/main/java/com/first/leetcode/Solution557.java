package com.first.leetcode;

/**
 * 反转字符串中的单词 III
 */
public class Solution557 {

    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            sb.reverse();
            result.append(sb);
            if (i != arr.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}

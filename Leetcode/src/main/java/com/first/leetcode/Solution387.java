package com.first.leetcode;

/**
 * 字符串中的第一个唯一字符
 * Created by zhangwei03 on 2019/7/25.
 */
public class Solution387 {

    public static int firstUniqChar(String s) {
        if (s.isEmpty()) {
            return -1;
        }
        int length = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            arr[c - 'a']++;
        }
        for (int j = 0; j < length; j++) {
            char charStr = s.charAt(j);
            if (arr[charStr - 'a'] == 1) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aaa"));
    }
}

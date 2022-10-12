package com.leetcode;

/**
 * @author : zhangwei
 * @description : 回文数
 * @date: 2021-08-30 11:16
 */

public class Solution9 {

    public boolean isPalindrome(int x) {
        String str = x + "";
        int begin = 0;
        int end = str.length() - 1;
        while (begin <= end) {
            if (str.charAt(begin) == str.charAt(end)) {
                begin++;
                end--;
            } else {
                break;
            }
        }
        return begin > end;
    }

    public static void main(String[] args) {
        System.out.println(new Solution9().isPalindrome(121));
    }
}

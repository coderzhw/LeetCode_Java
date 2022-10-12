package com.leetcode;

/**
 * @author : zhangwei
 * @description : 反转字符串
 * @date: 2021-11-17 16:08
 */

public class Solution344 {

    public void reverseString(char[] s) {
        int begin = 0, end = s.length - 1;
        while (begin < end) {
            char tmp = s[begin];
            s[begin] = s[end];
            s[end] = tmp;
            begin++;
            end--;
        }
    }
}

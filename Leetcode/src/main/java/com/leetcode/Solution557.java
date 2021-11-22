package com.leetcode;

/**
 * @author : zhangwei
 * @description : 反转字符串中的单词 III
 * @date: 2021-11-17 16:20
 */

public class Solution557 {

    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString();
        }
        return String.join(" ", arr);
    }


    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(new Solution557().reverseWords(s));
    }
}

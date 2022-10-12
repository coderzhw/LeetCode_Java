package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最后一个单词的长度
 * @date: 2021-07-14 09:25
 */

public class Solution58 {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        if (end < 0) {
            return 0;
        }
        int start = end;
        while (start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        System.out.println(new Solution58().lengthOfLastWord("a "));
    }
}

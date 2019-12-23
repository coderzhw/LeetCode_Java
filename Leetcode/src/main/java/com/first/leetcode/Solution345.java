package com.first.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 反转字符串中的元音字母
 * Created by zhangwei03 on 2019/12/23.
 */
public class Solution345 {

    private final static HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
            'A', 'E', 'I', 'O', 'U'));

    public static String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                result[i++] = ci;
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;
            } else {
                result[i++] = cj;
                result[j--] = ci;
            }
        }
        return new String(result);

    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(reverseVowels(s));
    }
}

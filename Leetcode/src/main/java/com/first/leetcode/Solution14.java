package com.first.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 最长公共前缀
 */
public class Solution14 {


    public static String longestCommonPrefix(String[] strs) {
        //先按照字符串长度排序
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        if (strs.length == 0) {
            return "";
        }
        String shortestStr = strs[0];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < shortestStr.length(); i++) {
            char s = shortestStr.charAt(i);
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (s != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                stringBuilder.append(s);
            } else {
                stringBuilder.append(" ");
            }
        }
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < stringBuilder.length(); k++) {
            char charAt = stringBuilder.toString().charAt(k);
            if (charAt == ' ') {
                break;
            } else {
                result.append(charAt);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"aca", "cba"};
        System.out.println(longestCommonPrefix(strs));
    }

}

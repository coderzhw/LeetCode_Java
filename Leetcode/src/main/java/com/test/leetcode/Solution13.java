package com.test.leetcode;

/**
 * 罗马数字转整数
 * Created by zhangwei03 on 2019/7/17.
 */
public class Solution13 {

    public static int romanToInt(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (i + 1 < size && 'I' == arr[i] && 'V' == arr[i + 1]) {
                result += 4;
                i++;
            } else if (i + 1 < size && 'I' == arr[i] && 'X' == arr[i + 1]) {
                result += 9;
                i++;
            } else if (i + 1 < size && 'X' == arr[i] && 'L' == arr[i + 1]) {
                result += 40;
                i++;
            } else if (i + 1 < size && 'X' == arr[i] && 'C' == arr[i + 1]) {
                result += 90;
                i++;
            } else if (i + 1 < size && 'C' == arr[i] && 'D' == arr[i + 1]) {
                result += 400;
                i++;
            } else if (i + 1 < size && 'C' == arr[i] && 'M' == arr[i + 1]) {
                result += 900;
                i++;
            } else if ('I' == arr[i]) {
                result += 1;
            } else if ('V' == arr[i]) {
                result += 5;
            } else if ('X' == arr[i]) {
                result += 10;
            } else if ('L' == arr[i]) {
                result += 50;
            } else if ('C' == arr[i]) {
                result += 100;
            } else if ('D' == arr[i]) {
                result += 500;
            } else if ('M' == arr[i]) {
                result += 1000;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }
}

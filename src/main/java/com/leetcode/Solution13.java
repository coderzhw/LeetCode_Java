package com.leetcode;

/**
 * @author : zhangwei
 * @description : 罗马数字转整数
 * @date: 2021-07-19 08:30
 */

public class Solution13 {


    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && switchToInteger(s.charAt(i)) > switchToInteger(s.charAt(i - 1))) {
                result += switchToInteger(s.charAt(i)) - 2 * switchToInteger(s.charAt(i - 1));
            } else {
                result += switchToInteger(s.charAt(i));
            }
        }
        return result;
    }


    public int switchToInteger(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }


    public static void main(String[] args) {
        //   System.out.println(new Solution13().romanToInt("III"));
        System.out.println(new Solution13().romanToInt("IV"));
        System.out.println(new Solution13().romanToInt("IX"));
        //   System.out.println(new Solution13().romanToInt("LVIII"));
        System.out.println(new Solution13().romanToInt("MCMXCIV"));
    }

}

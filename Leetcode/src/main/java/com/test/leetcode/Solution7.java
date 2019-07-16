package com.test.leetcode;

/**
 * 整数反转
 */
public class Solution7 {

    public static int reverse(int x) {
        //先判断正负
        boolean flag = x >= 0 ? true : false;
        x = Math.abs(x);
        StringBuilder sb = new StringBuilder(x + "");
        String sbStr = sb.reverse().toString();
        return flag ? toInt(sbStr, 0) : (0 - toInt(sbStr, 0));
    }

    public static int toInt(String str, int defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return defaultValue;
        }
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 字符串转换整数 (atoi)
 * @date: 2021-07-15 14:27
 */

public class Solution8 {

    public int myAtoi(String s) {
        int length = s.length();
        long ans = 0;
        //正数为true,负数为false
        boolean flag = true;
        //是否读到过加号或者减号，读到了为true，没读到false
        boolean yes = false;
        for (int i = 0; i < length; i++) {
            if (!yes && s.charAt(i) == ' ') continue;
            else if (!yes && s.charAt(i) == '+') {
                yes = true;
            } else if (!yes && s.charAt(i) == '-') {
                flag = false;
                yes = true;
            } else if (!Character.isDigit(s.charAt(i))) {
                //中途被其他字符打断的情况
                break;
            } else {
                //这句话很关键
                yes = true;
                ans = ans * 10 + (s.charAt(i) - '0');
            }
            if (ans > Integer.MAX_VALUE && flag) {
                ans = Integer.MAX_VALUE;
                break;
            } else if (ans > Integer.MAX_VALUE && !flag) {
                ans = Math.abs(Integer.MIN_VALUE);
                break;
            }
        }
        return flag == true ? Integer.valueOf(ans + "") : -Integer.valueOf(ans + "");
    }


    public static void main(String[] args) {
//        System.out.println(new Solution8().myAtoi(".1"));
//        System.out.println(new Solution8().myAtoi("3.14159"));
//        System.out.println(new Solution8().myAtoi("42"));
//        System.out.println(new Solution8().myAtoi("   -42"));
//        System.out.println(new Solution8().myAtoi("4193 with words"));
//        System.out.println(new Solution8().myAtoi("words and 987"));
//        System.out.println(new Solution8().myAtoi("21474836460"));
//        System.out.println(new Solution8().myAtoi(""));
//        System.out.println(new Solution8().myAtoi("+"));
//        System.out.println(new Solution8().myAtoi("++"));
//        System.out.println(new Solution8().myAtoi("00000-42a1234"));
    }

}

package com.leetcode;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-07-15 14:27
 */

public class Solution8 {

    public int myAtoi(String s) {









        return 0;
    }



    public static void main(String[] args) {
        System.out.println(new Solution8().myAtoi(".1"));
        System.out.println(new Solution8().myAtoi("3.14159"));
        System.out.println(new Solution8().myAtoi("42"));
        System.out.println(new Solution8().myAtoi("   -42"));
        System.out.println(new Solution8().myAtoi("4193 with words"));
        System.out.println(new Solution8().myAtoi("words and 987"));
        System.out.println(new Solution8().myAtoi("-91283472332"));
        System.out.println(new Solution8().myAtoi(""));
        System.out.println(new Solution8().myAtoi("+"));
    }

}

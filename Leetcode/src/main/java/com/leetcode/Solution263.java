package com.leetcode;

/**
 * @author : zhangwei
 * @description : 丑数
 * @date: 2021-08-25 16:34
 */

public class Solution263 {

    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) n = n / 2;
        while (n % 3 == 0) n = n / 3;
        while (n % 5 == 0) n = n / 5;
        return n == 1;
    }


    public static void main(String[] args) {
        System.out.println(new Solution263().isUgly(14));
    }


}

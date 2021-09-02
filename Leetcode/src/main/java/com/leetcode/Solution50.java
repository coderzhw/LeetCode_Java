package com.leetcode;

/**
 * @author : zhangwei
 * @description : Pow(x, n)
 * @date: 2021-09-01 17:19
 */

public class Solution50 {

    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == Integer.MIN_VALUE && x < 0) return -1 / myPow(x, Integer.MAX_VALUE);
        if (n == Integer.MIN_VALUE && x > 0) return 1 / myPow(x, Integer.MAX_VALUE);
        if (n < 0) return 1 / myPow(x, -n);
        double v = myPow(x, n / 2);
        if (n % 2 == 0) {
            return v * v;
        } else {
            return x * v * v;
        }
    }


    public static void main(String[] args) {
        System.out.println(new Solution50().myPow(3, 10));
    }


}

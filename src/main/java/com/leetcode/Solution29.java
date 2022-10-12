package com.leetcode;

/**
 * @author : zhangwei
 * @description : 两数相除
 * @date: 2021-09-01 13:40
 */

public class Solution29 {

    public int divide(int dividend, int divisor) {
        if (divisor == -1 && dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
        boolean sign = true;
        if ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) {
            sign = false;
        }
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int ans = div(dividend, divisor);
        return sign == true ? ans : -ans;
    }


    /**
     * a、b都是负数，所以逻辑都是反过来的
     *
     * @param a
     * @param b
     * @return
     */
    public int div(int a, int b) {
        if (a > b) return 0;
        int count = 1;
        int tb = b;
        while (tb >= a - tb) {
            count += count;
            tb += tb;
        }
        return count + div(a - tb, b);
    }


    public static void main(String[] args) {
        System.out.println(new Solution29().divide(7,-3));
    }


}

package com.first.leetcode;

/**
 * x的平方根
 */
public class Solution69 {

    public static int mySqrt(int x) {
        long result = x;
        while (result * result > x) {
            result = (result + x / result) / 2;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

}

package com.first.leetcode;

/**
 * 颠倒二进制位
 */
public class Solution190 {

    public static int reverseBits(int n) {
     return Integer.reverse(n);
    }

    public static void main(String[] args) {
        System.out.println(reverseBits(-3));
    }
}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 颠倒二进制位
 * @date: 2021-09-01 18:53
 */

public class Solution190 {


    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n = n >> 1;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution190().reverseBits(43261596));
    }

}

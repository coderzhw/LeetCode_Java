package com.leetcode;

/**
 * @author : zhangwei
 * @description : 阶乘后的零
 * @date: 2021-08-26 08:51
 */

public class Solution172 {

    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Solution172().trailingZeroes(5));
    }
}

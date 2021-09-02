package com.leetcode;

/**
 * @author : zhangwei
 * @description : 位1的个数
 * @date: 2021-09-01 18:13
 */

public class Solution191 {

    public int hammingWeight(int n) {

        int count = 0;

        while (n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

}

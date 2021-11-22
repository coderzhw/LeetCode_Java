package com.leetcode;

/**
 * @author : zhangwei
 * @description : 比特位计数
 * @date: 2021-11-19 16:48
 */

public class Solution338 {

    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        result[0] = 0;
        for (int i = 1; i < result.length; i++) {
            if ((i & 1) == 1) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = result[i / 2];
            }
        }
        return result;
    }
}

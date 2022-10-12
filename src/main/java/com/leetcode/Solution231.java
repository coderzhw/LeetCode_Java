package com.leetcode;

/**
 * @author : zhangwei
 * @description : 2 的幂
 * @date: 2021-09-02 08:06
 */

public class Solution231 {

    public boolean isPowerOfTwo(int n) {

        return (n > 0 && (n & (n - 1)) == 0);
    }
}

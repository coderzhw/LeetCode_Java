package com.leetcode;

/**
 * @author : zhangwei
 * @description : 4的幂
 * @date: 2021-09-02 08:26
 */

public class Solution342 {

    public boolean isPowerOfFour(int n) {
        return (Math.log10(n)/Math.log10(4))%1==0;
    }
}

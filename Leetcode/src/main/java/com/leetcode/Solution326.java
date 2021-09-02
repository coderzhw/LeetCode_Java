package com.leetcode;

/**
 * @author : zhangwei
 * @description : 3的幂
 * @date: 2021-09-02 08:08
 */

public class Solution326 {

    public boolean isPowerOfThree(int n) {
        //这里必须是log10,不能是log
        return (Math.log10(n)/Math.log10(3))%1==0;
    }
}

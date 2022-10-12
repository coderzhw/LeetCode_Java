package com.leetcode;

/**
 * @author : zhangwei
 * @description : 斐波那契数
 * @date: 2021-09-13 16:23
 */

public class Solution509 {


    public int fib(int n) {
        if(n<2){
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution509().fib(100));
    }

}

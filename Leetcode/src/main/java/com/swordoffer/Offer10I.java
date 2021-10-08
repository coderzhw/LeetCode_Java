package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 斐波那契数列
 * @date: 2021-10-08 10:43
 */

public class Offer10I {

    public int fib(int n) {
        if(n<2) return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1]%1000000007 + dp[i - 2]%1000000007;
        }
        return  dp[n]%1000000007 ;
    }

    public static void main(String[] args) {
        System.out.println(new Offer10I().fib(48));
    }

}

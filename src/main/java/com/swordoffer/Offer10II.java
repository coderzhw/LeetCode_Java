package com.swordoffer;

/**
 * @author : zhangwei
 * @description :青蛙跳台阶问题
 * @date: 2021-10-09 14:01
 */

public class Offer10II {

    public int numWays(int n) {
        if(n<2) return 1;
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 剪绳子
 * @date: 2021-10-28 13:54
 */

public class Offer14I {

    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[2]=1;
        for(int i=3;i<=n;i++){
            for(int j=1;j<i;j++){
                dp[i]=Math.max(dp[i],Math.max((i-j)*j,dp[i-j]*j));
            }
        }
        return dp[n];
    }
}

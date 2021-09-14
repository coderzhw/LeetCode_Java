package com.leetcode;

/**
 * @author : zhangwei
 * @description : 不同的二叉搜索树
 * @date: 2021-09-14 15:26
 */

public class Solution96 {

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0]=1;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
                dp[i] += dp[j-1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new Solution96().numTrees(3));
    }


}

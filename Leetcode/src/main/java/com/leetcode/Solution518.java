package com.leetcode;

/**
 * @author : zhangwei
 * @description : 零钱兑换 II
 * @date: 2021-09-22 15:09
 */

public class Solution518 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int amount = 5;
        int[] coins = {1, 2, 5};
        System.out.println(new Solution518().change(amount, coins));
    }


}

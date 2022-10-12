package com.swordoffer;

/**
 * @author : zhangwei
 * @description : n个骰子的点数
 * @date: 2021-11-01 10:46
 */

public class Offer60 {

    public double[] dicesProbability(int n) {
        double[][] dp = new double[n + 1][6 * n + 1];
        for (int i = 1; i <= 6; i++) {
            dp[1][i] = 1.0 / 6.0;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= 6 * i; j++) {
                for (int k = 1; k <= 6; k++) {
                    if (i - 1 >= 0 && j - k >= 0) {
                        dp[i][j] += dp[i - 1][j - k] * dp[1][k];
                    }
                }
            }
        }
        double[] result = new double[5 * n + 1];
        int index = 0;
        for (int i = n; i <= 6 * n; i++) {
            result[index++] = dp[n][i];
        }
        return result;
    }


}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 礼物的最大价值
 * @date: 2021-11-01 16:19
 */

public class Offer47 {


    public int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        //初始化
        dp[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }
        int result = Math.max(dp[m - 1][0], dp[0][n - 1]);
        //循环获取最大值
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                result = Math.max(dp[i][j], result);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(new Offer47().maxValue(arr));
    }


}

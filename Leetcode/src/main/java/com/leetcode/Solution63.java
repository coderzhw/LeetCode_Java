package com.leetcode;

/**
 * @author : zhangwei
 * @description : 不同路径 II
 * @date: 2021-08-25 14:49
 */

public class Solution63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] result = new int[m][n];
        if (obstacleGrid[0][0] != 0 || obstacleGrid[m - 1][n - 1] != 0) {
            return 0;
        }
        result[0][0] = 1;
        return dfs(obstacleGrid, m - 1, n - 1, result);
    }


    public int dfs(int[][] obstacleGrid, int m, int n, int[][] result) {
        if (m < 0 || n < 0) return 0;
        if (obstacleGrid[m][n] != 0) {
            return 0;
        }
        if (m == 0 && n == 0) {
            return result[0][0];
        }
        if (result[m][n] > 0) {
            return result[m][n];
        }
        result[m][n] = dfs(obstacleGrid, m - 1, n, result)
                + dfs(obstacleGrid, m, n - 1, result);
        return result[m][n];
    }

    public int uniquePathsWithObstacles2(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 0) {
                dp[i][0] = 1;
            } else {
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i] == 0) {
                dp[0][i] = 1;
            } else {
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] != 0) {
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }


    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        System.out.println(new Solution63().uniquePathsWithObstacles(obstacleGrid));
        System.out.println(new Solution63().uniquePathsWithObstacles2(obstacleGrid));
    }


}

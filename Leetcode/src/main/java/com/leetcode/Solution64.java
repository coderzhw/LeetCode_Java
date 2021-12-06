package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description :最小路径和
 * @date: 2021-12-01 09:41
 */

public class Solution64 {


    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];
        dp[0][0] = grid[0][0];
        //初始化
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }


    public int minPathSum2(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] cache = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(cache[i], -1);
        }
        return dfs(m - 1, n - 1, grid, cache);
    }

    //备忘录法递归
    public int dfs(int x, int y, int[][] grid, int[][] cache) {
        if (x < 0 || y < 0) return Integer.MAX_VALUE;
        if (x == 0 && y == 0) return grid[0][0];
        if (cache[x][y] != -1) return cache[x][y];
        cache[x][y] = Math.min(dfs(x - 1, y, grid, cache), dfs(x, y - 1, grid, cache)) + grid[x][y];
        return cache[x][y];
    }


    public static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        Solution64 s = new Solution64();
        System.out.println(s.minPathSum2(grid));
    }

}

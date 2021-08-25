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
        if(obstacleGrid[0][0]!=0 || obstacleGrid[m-1][n-1]!=0){
            return 0;
        }
        result[0][0] = 1;
        return dfs(obstacleGrid, m - 1, n - 1, result);
    }


    public int dfs(int[][] obstacleGrid, int m, int n, int[][] result) {
        if(m<0 || n<0) return 0;
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

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0}, { 1, 1}, {0, 0}};
        System.out.println(new Solution63().uniquePathsWithObstacles(obstacleGrid));
    }


}

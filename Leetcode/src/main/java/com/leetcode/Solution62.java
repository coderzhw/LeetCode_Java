package com.leetcode;

/**
 * @author : zhangwei
 * @description : 不同路径
 * @date: 2021-08-25 14:07
 */

public class Solution62 {

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        arr[0][0] = 1;
        return dfs(m - 1, n - 1, arr);
    }

    public int dfs(int m, int n, int[][] arr) {
        if (m == 0 || n == 0) {
            return arr[0][0];
        }
        if (arr[m][n] > 0) {
            return arr[m][n];
        }
        arr[m][n] = dfs(m - 1, n, arr) + dfs(m, n - 1, arr);
        return arr[m][n];
    }


    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(new Solution62().uniquePaths(m, n));
    }
}

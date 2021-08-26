package com.leetcode;

/**
 * @author : zhangwei
 * @description : N皇后 II
 * @date: 2021-08-26 16:00
 */

public class Solution52 {

    public int count = 0;

    public int totalNQueens(int n) {
        char[][] arr = new char[n][n];
        //初始化二维矩阵
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        dfs(arr, 0, n);
        return count;
    }

    public void dfs(char[][] arr, int row, int n) {
        if (row == n) {
            count++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isVaild(arr, row, col, n)) {
                arr[row][col] = 'Q';
                dfs(arr, row + 1, n);
                arr[row][col] = '.';
            }
        }
    }

    public boolean isVaild(char[][] arr, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new Solution52().totalNQueens(8));
    }


}

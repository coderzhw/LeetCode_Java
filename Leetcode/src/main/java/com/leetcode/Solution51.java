package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : N 皇后
 * @date: 2021-08-26 15:04
 */

public class Solution51 {

    public List<List<String>> solveNQueens(int n) {
        //先初始化棋盘
        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }
        List<List<String>> result = new ArrayList<>();
        dfs(arr, n, 0, result);
        return result;
    }

    public void dfs(char[][] arr, int n, int row, List<List<String>> result) {
        if (row == n) {
            List<String> path = arrToList(arr);
            result.add(new ArrayList<>(path));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isVaild(arr, row, col, n)) {
                arr[row][col] = 'Q';
                dfs(arr, n, row + 1, result);
                arr[row][col] = '.';
            }
        }
    }


    public List<String> arrToList(char[][] arr) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < arr[i].length; j++) {
                s.append(arr[i][j]);
            }
            result.add(s.toString());
        }
        return result;
    }

    public boolean isVaild(char[][] arr, int row, int col, int n) {
        //检查列，左上，右上，三个方向即可,下面的部分不用检查
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
        System.out.println(new Solution51().solveNQueens(8));
    }

}

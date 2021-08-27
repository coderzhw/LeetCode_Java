package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 解数独
 * @date: 2021-08-27 15:20
 */

public class Solution37 {


    public void solveSudoku(char[][] board) {
        dfs(board);
    }


    public boolean dfs(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (board[row][col] != '.') {
                    continue;
                }
                for (char k = '1'; k <= '9'; k++) {
                    if (isVaild(board, row, col, k)) {
                        board[row][col] = k;
                        if (dfs(board)) {
                            return true;
                        }
                        board[row][col] = '.';
                    }
                }
                return false;
            }
        }
        return true;
    }

    public boolean isVaild(char[][] board, int row, int col, char k) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == k) {
                return false;
            }
        }
        for (int j = 0; j < board[0].length; j++) {
            if (board[row][j] == k) {
                return false;
            }
        }
        int m = (row / 3) * 3;
        int n = (col / 3) * 3;
        for (int p = m; p < m + 3; p++) {
            for (int q = n; q < n + 3; q++) {
                if (board[p][q] == k) {
                    return false;
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        new Solution37().solveSudoku(board);
        System.out.println(Arrays.deepToString(board));
    }


}

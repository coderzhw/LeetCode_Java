package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 矩阵中的路径
 * @date: 2021-11-03 14:13
 */

public class Offer12 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visted = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, visted, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean dfs(char[][] board, boolean[][] visted, int i, int j, int depth, String word) {

        //越界检测
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
            return false;
        }
        //其他检测
        if (visted[i][j] || board[i][j] != word.charAt(depth)) {
            return false;
        }
        if (depth == word.length()) {
            return true;
        }
        visted[i][j] = true;
        boolean result = dfs(board, visted, i + 1, j, depth+1, word) ||
                dfs(board, visted, i - 1, j, depth+1, word) ||
                dfs(board, visted, i, j + 1, depth+1, word) ||
                dfs(board, visted, i, j - 1, depth+1, word);
        visted[i][j] = false;
        return result;
    }


    public static void main(String[] args) {

    }


}

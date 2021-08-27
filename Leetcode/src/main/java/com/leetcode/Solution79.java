package com.leetcode;

/**
 * @author : zhangwei
 * @description : 单词搜索
 * @date: 2021-08-27 15:59
 */

public class Solution79 {

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visted = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, 0, i, j, visted)) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean dfs(char[][] board, String word, int depth, int x, int y, boolean[][] visted) {
        if (depth == word.length()) {
            return true;
        }
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) {
            return false;
        }
        if (visted[x][y]) return false;
        if (board[x][y] != word.charAt(depth)) {
            return false;
        }
        visted[x][y] = true;
        boolean result = dfs(board, word, depth + 1, x + 1, y, visted)
                || dfs(board, word, depth + 1, x - 1, y, visted)
                || dfs(board, word, depth + 1, x, y - 1, visted)
                || dfs(board, word, depth + 1, x, y + 1, visted);
        visted[x][y] = false;
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(new Solution79().exist(board, word));
    }


}

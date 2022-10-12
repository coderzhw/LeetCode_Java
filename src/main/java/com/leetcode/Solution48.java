package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 旋转图像
 * @date: 2021-12-07 10:49
 */

public class Solution48 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //先上下翻转，再沿对角线翻转
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                swap(matrix, i, j, n - 1 - i, j);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }

    public void swap(int[][] matrix, int i, int j, int x, int y) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = tmp;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Solution48().rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}

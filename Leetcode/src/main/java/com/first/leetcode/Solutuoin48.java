package com.first.leetcode;

/**
 * 旋转矩阵
 * Created by zhangwei03 on 2019/9/3.
 */
public class Solutuoin48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //先沿对角线交换
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                swapArr(matrix, i, j, n - 1 - j, n - 1 - i);
            }
        }
        //再水平交换
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                swapArr(matrix, i, j, n - 1 - i, j);
            }
        }
    }

    public static void swapArr(int[][] matrix, int i, int j, int m, int n) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[m][n];
        matrix[m][n] = tmp;
    }

    public static void main(String[] args) {

    }
}

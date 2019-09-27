package com.first.leetcode;

/**
 * 旋转图像
 * Created by zhangwei03 on 2019/9/27.
 */
public class Solution48 {

    public static void rotate(int[][] matrix) {
        int n = matrix[0].length;
        diagRotate(matrix, n);
        updownRotate(matrix, n);
    }
    public static void diagRotate(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][n - i - 1];
                matrix[n - j - 1][n - i - 1] = tmp;
            }
        }
    }
    public static void updownRotate(int[][] matrix, int n) {
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = tmp;
            }
        }
    }


    public static void main(String[] args) {

    }
}

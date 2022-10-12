package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 螺旋矩阵 II
 * @date: 2021-09-01 09:59
 */

public class Solution59 {

    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        int num = 1;
        while (num <= n * n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                result[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                result[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                result[i][left] = num;
                num++;
            }
            left++;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution59().generateMatrix(3)));
    }


}

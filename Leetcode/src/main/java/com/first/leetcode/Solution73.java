package com.first.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 矩阵置零
 * Created by zhangwei03 on 2019/9/27.
 */
public class Solution73 {

    public static void setZeroes(int[][] matrix) {
        List<List<Integer>> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(i);
                    tmp.add(j);
                    list.add(tmp);
                }
            }
        }
        if (list != null && list.size() != 0) {
            for (List<Integer> arr : list) {
                int i = arr.get(0);
                int j = arr.get(1);
                setZero(matrix, i, j);
            }
        }
    }

    public static void setZero(int[][] matrix, int i, int j) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int k = 0; k < m; k++) {
            matrix[k][j] = 0;
        }
        for (int l = 0; l < n; l++) {
            matrix[i][l] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(a);
        System.out.println(a);
    }
}

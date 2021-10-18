package com.swordoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 顺时针打印矩阵
 * @date: 2021-10-18 15:18
 */

public class Offer29 {
    public int[] spiralOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[0];
        int n = matrix[0].length;
        List<Integer> result = new ArrayList();
        int left = 0, right = n - 1, top = 0, bottom = m - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            if (top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if (right < left) break;
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            if (bottom < top) break;
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }

        int[] arr = new int[result.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        // int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix = {};
        System.out.println(Arrays.toString(new Offer29().spiralOrder(matrix)));
    }
}

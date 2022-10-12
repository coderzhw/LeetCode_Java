package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 螺旋矩阵
 * @date: 2021-09-01 08:42
 */

public class Solution54 {


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (true) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            if (++top > bottom) break;
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            if (--right < left) break;
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
            if (--bottom < top) break;
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            if (++left > right) break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(new Solution54().spiralOrder(matrix));
    }


}

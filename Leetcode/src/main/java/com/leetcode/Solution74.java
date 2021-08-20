package com.leetcode;

/**
 * @author : zhangwei
 * @description :  搜索二维矩阵
 * @date: 2021-08-20 13:34
 */

public class Solution74 {


    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int left = 0;
        int right = rowLength * columnLength - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / columnLength;
            int column = mid % columnLength;
            if (matrix[row][column] == target) {
                return true;
            }
            if (matrix[row][column] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 4;
        System.out.println(new Solution74().searchMatrix(matrix, target));
    }
}

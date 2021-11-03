package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 二维数组中的查找
 * @date: 2021-11-03 16:27
 */

public class Offer04 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix==null||matrix.length==0) return false;
        int m=matrix.length;
        int n=matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,1}};
        int target=2;
        System.out.println(new Offer04().findNumberIn2DArray(matrix,target));
    }

}

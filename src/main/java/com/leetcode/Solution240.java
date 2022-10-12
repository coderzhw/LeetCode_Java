package com.leetcode;

/**
 * @author : zhangwei
 * @description : 搜索二维矩阵 II
 * @date: 2021-08-20 16:03
 */

public class Solution240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        //选择右上角为遍历的起点（左下角也可以，具体怎么选出来的？要符合剪枝的策略，能缩小范围才行）
        int i=0;
        int j=matrix[0].length-1;
        while (j>=0 && i<matrix.length){
            if(matrix[i][j]==target){
                return true;
            }
            if(matrix[i][j] >target){
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target=5;
        System.out.println(new Solution240().searchMatrix(matrix,target));
    }
}

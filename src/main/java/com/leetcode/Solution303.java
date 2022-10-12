package com.leetcode;

/**
 * @author : zhangwei
 * @description : 区域和检索 - 数组不可变
 * @date: 2021-07-06 16:12
 */

public class Solution303 {


    static class NumArray {


        int[] sum;

        public NumArray(int[] nums) {
            sum = new int[nums.length + 1];
            sum[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                sum[i + 1] = sum[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sum[right + 1] - sum[left];
        }
    }


    public static void main(String[] args) {
        int num[] = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(num);
        numArray.sumRange(0, 2);

    }

}

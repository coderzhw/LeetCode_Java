package com.leetcode;

/**
 * @author : zhangwei
 * @description : 移动0
 * @date: 2021-05-31 15:28
 */

public class Solution283 {

    public static void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int m = i; m < nums.length; m++) {
            nums[m] = 0;
        }
        //  System.out.println(Arrays.toString(nums));
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
    }


}

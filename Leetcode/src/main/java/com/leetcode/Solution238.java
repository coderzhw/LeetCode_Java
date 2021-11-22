package com.leetcode;

/**
 * @author : zhangwei
 * @description : 除自身以外数组的乘积
 * @date: 2021-11-18 13:43
 */

public class Solution238 {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int left = 1;
        int right = 1;
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = left;
            left=left*nums[i];
        }
        for (int i = length - 1; i >= 0; i--) {
           result[i]=result[i]*right;
           right=right*nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(new Solution238().productExceptSelf(nums));
    }


}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 寻找旋转排序数组中的最小值
 * @date: 2021-08-20 14:03
 */

public class Solution153 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }



    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        System.out.println(new Solution153().findMin(nums));
    }


}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 寻找旋转排序数组中的最小值 II
 * @date: 2021-08-20 15:22
 */

public class Solution154 {

    public int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid!=right && nums[mid] == nums[right]) {
                right--;
                continue;
            }
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5};
        System.out.println(new Solution154().findMin(nums));
    }

}

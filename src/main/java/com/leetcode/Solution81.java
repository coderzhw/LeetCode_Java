package com.leetcode;

/**
 * @author : zhangwei
 * @description : 搜索旋转排序数组 II
 * @date: 2021-08-20 10:20
 */

public class Solution81 {

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (nums[mid] == nums[left]) {
                left++;
                continue;
            }
            if (nums[mid] == nums[right]) {
                right--;
                continue;
            }
            // 在左侧递增
            if (nums[mid] > nums[left]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        System.out.println(new Solution81().search(nums,target));
    }
}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 搜索插入位置
 * @date: 2021-04-28 15:13
 */

public class Solution35 {


    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                return mid;

            }
        }
        return left;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{1, 3,5,6};
        System.out.println(searchInsert(nums, 5));
        System.out.println(searchInsert(nums, 2));
        System.out.println(searchInsert(nums, 7));
        System.out.println(searchInsert(nums, 0));
    }


}

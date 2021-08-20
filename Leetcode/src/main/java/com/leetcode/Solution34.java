package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 在排序数组中查找元素的第一个和最后一个位置
 * @date: 2021-08-20 10:46
 */

public class Solution34 {

    public static int[] searchRange(int[] nums, int target) {
        int low = lowBound(nums, target);
        int up = upBound(nums, target);
        if (up<low) {
            int result[] = {-1, -1};
            return result;
        } else {
            int result[] = {low, up};
            return result;
        }
    }

    public static int lowBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int upBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }


    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;
        System.out.println(Arrays.toString(new Solution34().searchRange(nums, target)));
    }

}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 缺失的第一个正数
 * @date: 2021-08-19 09:27
 */

public class Solution41 {

    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] > 0 &&  nums[i]<nums.length &&nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i+1;
            }
        }
        return nums.length + 1;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println(new Solution41().firstMissingPositive(nums));
    }

}

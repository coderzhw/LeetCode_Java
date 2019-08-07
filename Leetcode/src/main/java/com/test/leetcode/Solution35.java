package com.test.leetcode;

/**
 * 搜索插入位置
 * Created by zhangwei03 on 2019/8/7.
 */
public class Solution35 {

    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[0] > target) {
                return 0;
            } else if (nums[length - 1] < target) {
                return length;
            } else if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

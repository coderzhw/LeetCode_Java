package com.leetcode;

/**
 * @author : zhangwei
 * @description : 移除元素
 * @date: 2021-05-06 11:03
 */

public class Solution27 {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < len; fast++) {
            if (nums[fast] == val) {
                continue;
            } else {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int len = removeElement(nums, 2);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }
    }
}

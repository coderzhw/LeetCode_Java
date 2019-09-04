package com.first.leetcode;

import java.util.Arrays;

/**
 * 旋转数组
 * Created by zhangwei03 on 2019/7/24.
 */
public class Solution189 {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        int flag = length - (k % length);
        for (int i = 0; i < length; i++) {
            result[i] = nums[(flag + i) % length];

        }
        for (int j = 0; j < length; j++) {
            nums[j] = result[j];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2};
        rotate(nums, 3);
    }

}

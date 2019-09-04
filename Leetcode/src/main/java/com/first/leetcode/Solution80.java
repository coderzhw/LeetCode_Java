package com.first.leetcode;

import java.util.Arrays;

/**
 * 删除数组中的重复项II
 * Created by zhangwei03 on 2019/8/6.
 */
public class Solution80 {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int len = nums.length;
        if (len <= 2) {
            return len;
        } else {
            int count = 1;
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    if (count < 2) {
                        nums[++i] = nums[j];
                        count++;
                    }
                } else {
                    count = 1;
                    nums[++i] = nums[j];
                }
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

}

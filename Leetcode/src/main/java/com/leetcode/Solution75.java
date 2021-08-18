package com.leetcode;

import java.util.Arrays;

/**
 * 颜色分类
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        int n0, n1;
        n0 = n1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            nums[i] = 2;
            if (tmp < 2) {
                nums[n1++] = 1;
            }
            if (tmp < 1) {
                nums[n0++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        new Solution75().sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}

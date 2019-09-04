package com.first.leetcode;

import java.util.Arrays;

/**
 * Created by zhangwei03 on 2019/7/24.
 */
public class Solution75 {
    public static void sortColors(int[] nums) {
        int count0, count1, count2;
        count0 = count1 = count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < count0) {
                nums[i] = 0;
            } else if (i>=count0 && i < count0 + count1) {
                nums[i] = 1;
            } else if (i>=count0+count1) {
                nums[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
    }

}

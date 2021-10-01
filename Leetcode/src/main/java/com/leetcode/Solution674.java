package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 最长连续递增序列
 * @date: 2021-09-29 16:24
 */

public class Solution674 {

    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int result = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            }
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(new Solution674().findLengthOfLCIS(nums));
    }

}

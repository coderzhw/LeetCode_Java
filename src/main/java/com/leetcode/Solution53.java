package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最大子序和
 * @date: 2021-09-30 15:41
 */

public class Solution53 {

    public int maxSubArray(int[] nums) {
        int result = nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            result = Math.max(dp[i], result);
        }
        return result;
    }

}

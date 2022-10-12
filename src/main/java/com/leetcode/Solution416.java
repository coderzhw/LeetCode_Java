package com.leetcode;

/**
 * @author : zhangwei
 * @description : 分割等和子集
 * @date: 2021-09-15 11:04
 */

public class Solution416 {


    /**
     * 动态规划题目需要
     * @param nums
     * @return
     */
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (nums.length == 1 || sum % 2 == 1) {
            return false;
        }
        int target = sum / 2;
        int[] dp = new int[target + 1];
        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
            }
        }
        return dp[target] == target;
    }


    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        System.out.println(new Solution416().canPartition(nums));
    }

}

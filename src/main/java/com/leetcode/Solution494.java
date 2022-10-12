package com.leetcode;

/**
 * @author : zhangwei
 * @description : 目标和
 * @date: 2021-09-18 10:56
 */

public class Solution494 {

    public int findTargetSumWays(int[] nums, int target) {

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (Math.abs(target) > sum) return 0;
        //向下取整如果不能整除则没有结果
        if ((target + sum) % 2 == 1) return 0;
        //背包容量
        int size = (target + sum) / 2;

        int[] dp = new int[size + 1];

        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = size; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[size];
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1};
        int target = 3;
        System.out.println(new Solution494().findTargetSumWays(nums, target));
    }


}

package com.leetcode;

/**
 * @author : zhangwei
 * @description : 打家劫舍 II
 * @date: 2021-09-26 14:47
 */

public class Solution213 {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        if (len == 2) return Math.max(nums[0], nums[1]);
        return Math.max(subRob(nums, 1, len - 1), subRob(nums, 0, len - 2));
    }


    //左闭右闭区间
    public int subRob(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2 + start; i <= end; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[end];
    }


    public static void main(String[] args) {
        int[] nums = {2, 3, 2};
        System.out.println(new Solution213().rob(nums));
    }


}

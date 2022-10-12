package com.leetcode;

/**
 * @author : zhangwei
 * @description : 组合总和 Ⅳ
 * @date: 2021-08-25 11:03
 */

public class Solution377 {

    public int result = 0;

    //暴力搜索超时，必须要动态规划
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        return dp[target];
    }


    public static void main(String[] args) {
        int[] candidates = {9};
        int target = 3;
        System.out.println(new Solution377().combinationSum4(candidates, target));
    }


}

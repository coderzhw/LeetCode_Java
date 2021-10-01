package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 最长递增子序列
 * @date: 2021-09-29 14:09
 */

public class Solution300 {

    public int lengthOfLIS(int[] nums) {
        //先把长度设为1
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
        }
        int result = 0;
        for (int num : dp) {
            result = Math.max(result, num);
        }
        return result;
    }

}

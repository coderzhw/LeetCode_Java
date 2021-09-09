package com.leetcode;

/**
 * @author : zhangwei
 * @description :跳跃游戏
 * @date: 2021-09-06 18:35
 */

public class Solution55 {


    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}

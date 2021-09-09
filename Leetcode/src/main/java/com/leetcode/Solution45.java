package com.leetcode;

/**
 * @author : zhangwei
 * @description : 跳跃游戏 II
 * @date: 2021-09-08 14:54
 */

public class Solution45 {

    public int jump(int[] nums) {
        int ans = 0;
        int curJumpMax = 0;
        int curPosMax = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            curPosMax = Math.max(curPosMax, i + nums[i]);
            if (i == curJumpMax) {
                ans++;
                curJumpMax = curPosMax;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(new Solution45().jump(nums));
    }
}

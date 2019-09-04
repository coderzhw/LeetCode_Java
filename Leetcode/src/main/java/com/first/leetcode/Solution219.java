package com.first.leetcode;

/**
 * 存在重复元素 II
 * Created by zhangwei03 on 2019/8/7.
 */
public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length < 2) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(j - i) <= k) {
                    return true;
                }
            }
        }
        return false;
    }
}

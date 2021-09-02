package com.leetcode;

/**
 * @author : zhangwei
 * @description : 丢失的数字
 * @date: 2021-09-02 08:29
 */

public class Solution268 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return  n * (n + 1) / 2-sum;
    }


}

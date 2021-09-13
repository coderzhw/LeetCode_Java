package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 按要求补齐数组
 * @date: 2021-09-10 14:31
 */

public class Solution330 {

    public int minPatches(int[] nums, int n) {
        int result = 0, i = 0;
        long maxi = 1;
        while (maxi <=n) {
            if (i < nums.length && nums[i] <= maxi) {
                maxi += nums[i];
                i++;
            } else {
                maxi += maxi;
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,31,33};

        int n = 2147483647;
        System.out.println(new Solution330().minPatches(nums, n));
    }
}

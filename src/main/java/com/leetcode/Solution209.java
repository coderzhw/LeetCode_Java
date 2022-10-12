package com.leetcode;

/**
 * 长度最小的子数组
 */
public class Solution209 {

    public static int minSubArrayLen(int target, int[] nums) {
        int resut = Integer.MAX_VALUE;
        int sum = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                resut = Math.min(resut, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return resut == Integer.MAX_VALUE ? 0 : resut;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums ={2, 3, 1, 2, 4, 3};
        System.out.println(minSubArrayLen(target, nums));
    }

}

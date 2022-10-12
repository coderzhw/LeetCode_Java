package com.leetcode;

/**
 * @author : zhangwei
 * @description : 只出现一次的数字 II
 * @date: 2021-09-01 20:45
 */

public class Solution137 {

    public int singleNumber(int[] nums) {
        int[] cnt = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                cnt[j] += nums[i] & 1;
                cnt[j] = cnt[j] % 3;
                nums[i] = nums[i] >> 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (cnt[i] << i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println(new Solution137().singleNumber(nums));
    }


}

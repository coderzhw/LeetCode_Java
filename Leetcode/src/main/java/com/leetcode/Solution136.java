package com.leetcode;

/**
 * @author : zhangwei
 * @description : 只出现一次的数字
 * @date: 2021-09-01 20:29
 */

public class Solution136 {

    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }


}

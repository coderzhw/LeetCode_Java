package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 只出现一次的数字 III
 * @date: 2021-09-02 17:58
 */

public class Solution260 {

    public int[] singleNumber(int[] nums) {
        int ret = 0;
        //先得到两个数的异或结果
        for (int i = 0; i < nums.length; i++) {
            ret = ret ^ nums[i];
        }
        int tmp = 1;
        while ((tmp & ret) == 0) {
            tmp = tmp << 1;
        }
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((tmp & nums[i]) ==0 ) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        int[] result = {a, b};
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};
        System.out.println(Arrays.toString(new Solution260().singleNumber(nums)));
    }


}

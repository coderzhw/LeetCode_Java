package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 多数元素
 * @date: 2021-06-01 13:57
 */

public class Solution169 {

//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }


    public static int majorityElement(int[] nums) {
        int result = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {

            if (result == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result = nums[i];
                count = 1;
            }

        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));
    }

}

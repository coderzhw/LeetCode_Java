package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 旋转数组
 * @date: 2021-06-09 11:13
 */

public class Solution189 {

    public static void rotate(int[] nums, int k) {
        //先对长度取余,将数组分为两部分
        k = k % nums.length;
        reserve(nums, 0, nums.length - k - 1);
        reserve(nums, nums.length - k, nums.length - 1);
        reserve(nums, 0, nums.length - 1);
    }

    private static void reserve(int[] nums, int begin, int end) {
        while (begin < end) {
            int tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
            begin++;
            end--;
        }
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);

        // reserve(nums,0,6);
        System.out.println(Arrays.toString(nums));

    }

}

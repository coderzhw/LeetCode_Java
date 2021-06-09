package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 下一个排列
 * @date: 2021-06-09 15:38
 */

public class Solution31 {

    public static void nextPermutation(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int len = nums.length;
        for (int i = len-1; i >= 1; i--) {
            //从后往前找第一个升序排列
            if (nums[i] > nums[i - 1]) {
                //从第i个元素开始往后先升序排列
                Arrays.sort(nums, i, len);
                for (int j = i - 1; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int tmp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = tmp;
                        return;
                    }
                }
            }
        }
        //如果是最大的数了就返回最小的那个排列
        Arrays.sort(nums);
    }


    public static void main(String[] args) {
       // int[] nums = {1, 2, 3, 8, 5, 7, 6, 4};
        int[] nums = {3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }


}

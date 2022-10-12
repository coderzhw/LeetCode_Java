package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description :最长连续序列
 * @date: 2021-06-02 16:50
 */

public class Solution128 {

    public static int longestConsecutive(int[] nums) {

        //1.先将元素存到一个set里面
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            numSet.add(nums[i]);
        }
        //2. 遍历数组
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.contains(nums[i] - 1)) {
                int length = 0;
                int temp = nums[i];
                while (numSet.contains(temp)) {
                    length++;
                    temp++;
                    result = Math.max(length, result);
                }

            }

        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));

    }
}

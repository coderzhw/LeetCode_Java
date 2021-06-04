package com.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 存在重复元素
 * @date: 2021-06-04 16:44
 */

public class Solution217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

}

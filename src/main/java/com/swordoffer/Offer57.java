package com.swordoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 和为s的两个数字
 * @date: 2021-10-13 11:17
 */

public class Offer57 {

    public int[] twoSum(int[] nums, int target) {
        Set<Integer> s = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            s.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(target - nums[i])) {
                return new int[]{nums[i], target - nums[i]};
            }
        }
        return new int[2];
    }
}

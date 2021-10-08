package com.swordoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 数组中重复的数字
 * @date: 2021-10-08 10:25
 */

public class Offer03 {

    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                return nums[i];
            }
        }
        return 0;
    }


}

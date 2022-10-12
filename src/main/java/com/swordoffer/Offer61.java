package com.swordoffer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 扑克牌中的顺子
 * @date: 2021-10-19 11:19
 */

public class Offer61 {


    public boolean isStraight(int[] nums) {
        Set<Integer> s = new HashSet();
        int min = 14, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            if (s.contains(nums[i])) return false;
            s.add(nums[i]);
        }
        return max - min < 5;
    }

}

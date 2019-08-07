package com.test.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhangwei03 on 2019/8/7.
 */
public class Solution268 {

    public static  int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            set.add(nums[j]);
        }
        for (int k = 0; k < nums.length+1; k++) {
            if (!set.contains(k)) {
                return k;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}

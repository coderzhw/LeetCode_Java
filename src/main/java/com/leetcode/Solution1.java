package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 两数之和
 */
public class Solution1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        
        return null;
    }

    public static void main(String[] args) {
          int [] nums={2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,18)));
    }
}

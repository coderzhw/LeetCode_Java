package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 存在重复元素 II
 * @date: 2021-06-04 17:13
 */

public class Solution219 {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int gap = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int tmp = Math.abs(map.get(nums[i]) - i);
                gap = Math.min(tmp, gap);
            }
            map.put(nums[i], i);
        }
        return gap <= k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 1};
        int k = 1;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}

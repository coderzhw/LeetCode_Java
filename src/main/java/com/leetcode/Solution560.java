package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 和为 K 的子数组
 * @date: 2021-12-08 14:38
 */

public class Solution560 {

    //前缀和数组，思路很巧妙
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        //这句话很关键，表示前缀和为0的有1个，就是不遍历时前缀和为0
        map.put(0, 1);
        int preSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (map.containsKey(preSum - k)) {
                count += map.get(preSum - k);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(new Solution560().subarraySum(nums, k));
    }

}

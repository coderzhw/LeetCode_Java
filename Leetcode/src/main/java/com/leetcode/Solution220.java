package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 存在重复元素 III
 * @date: 2021-06-08 11:08
 */

public class Solution220 {

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        //先判空
        if (k < 0 || t < 0 || nums.length == 0) {
            return false;
        }
        //构造桶，然后判断
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            long id = getId(nums[i], t);
            //第i个元素前面的第k个以前的桶不符合要求，应该要删掉
            if (i - (k + 1) >= 0) {
                map.remove(getId(nums[i - (k + 1)], t));
            }
            //当前桶有元素，直接返回true(各个桶里面最多只有一个元素)
            if (map.get(id) != null) {
                return true;
            }
            //前一个桶
            if (map.get(id - 1) != null && Math.abs(map.get(id - 1) - (long) nums[i]) <= t) {
                return true;
            }
            //后一个桶
            if (map.get(id + 1) != null && Math.abs(map.get(id + 1) - (long) nums[i]) <= t) {
                return true;
            }
            map.put(id, (long) nums[i]);
        }
        return false;
    }

    private static long getId(long i, long t) {
        if (i >= 0) {
            return i / (t + 1);
        } else {
            return (i + 1) / (t + 1) - 1;
        }
    }


    public static void main(String[] args) {

        int nums[] = {2147483647, -1, 2147483647}, k = 1, t = 2147483647;

        System.out.println(containsNearbyAlmostDuplicate(nums, k, t));


    }

}

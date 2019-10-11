package com.first.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 两个数组的交集II
 * Created by zhangwei03 on 2019/10/11.
 */
public class Solution350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                int count = map.get(nums1[i]);
                map.put(nums1[i], count + 1);
            } else {
                map.put(nums1[i], 1);
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            int count = map.get(nums2[j])==null?0:map.get(nums2[j]);
            if (count > 0) {
                result.add(nums2[j]);
                map.put(nums2[j], count - 1);
            }
        }

        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {

    }

}

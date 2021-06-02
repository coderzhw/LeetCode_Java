package com.leetcode;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 两个数组的交集 II
 * @date: 2021-06-02 15:56
 */

public class Solution350 {

    public static int[] intersect(int[] nums1, int[] nums2) {
        //num1为长度较短的那一个
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> shortNumMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (shortNumMap.containsKey(nums1[i])) {
                Integer count = shortNumMap.get(nums1[i]);
                shortNumMap.put(nums1[i], ++count);
            } else {
                shortNumMap.put(nums1[i], 1);
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            Integer count = shortNumMap.get(nums2[i]);
            if (shortNumMap.containsKey(nums2[i]) && count > 0) {
                result.add(nums2[i]);
                shortNumMap.put(nums2[i], --count);
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1,nums2)));
    }
}

package com.test.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 两个数组的交集
 */
public class Solution3349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        list1.retainAll(list2);
        Set<Integer> result = new HashSet<Integer>(list1);
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    public static void main(String[] args) {

    }
}

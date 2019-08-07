package com.test.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution33 {
    public static int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 0) {
            return -1;
        }
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (list.contains(target)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}

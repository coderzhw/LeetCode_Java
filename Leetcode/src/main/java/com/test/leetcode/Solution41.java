package com.test.leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by zhangwei03 on 2019/7/24.
 */
public class Solution41 {
    public static int firstMissingPositive(int[] nums) {

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            treeSet.add(nums[i]);
        }
        int max = treeSet.last() < 0 ? 0 : treeSet.last();
        for (int i = 1; i < max; i++) {
            if (!treeSet.contains(i)) {
                return i;
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
}

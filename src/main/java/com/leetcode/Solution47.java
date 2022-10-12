package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description :全排列 II
 * @date: 2021-08-24 15:41
 */

public class Solution47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, path, result);
        return result;

    }

    public void dfs(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == nums.length) {
            if (!result.contains(path)) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, used, path, result);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(new Solution47().permuteUnique(nums));
    }
}

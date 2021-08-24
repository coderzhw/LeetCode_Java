package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-08-24 16:13
 */

public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(nums, 0, path, result);
        return result;
    }

    public void dfs(int[] nums, int depth, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        if (depth >= nums.length) {
            return;
        }
        for (int i = depth; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new Solution78().subsets(nums));
    }

}

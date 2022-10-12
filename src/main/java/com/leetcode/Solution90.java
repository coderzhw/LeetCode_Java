package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 子集 II
 * @date: 2021-08-24 17:14
 */

public class Solution90 {


    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, 0, path, result);
        return result;
    }


    public void dfs(int[] nums, int depth, List<Integer> path, List<List<Integer>> result) {
        if (!result.contains(path)) {
            result.add(new ArrayList<>(path));
        }
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
        int[] nums = {4,4,4,1,4};
        System.out.println(new Solution90().subsetsWithDup(nums));
    }


}

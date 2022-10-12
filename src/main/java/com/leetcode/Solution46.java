package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 全排列
 * @date: 2021-08-24 15:06
 */

public class Solution46 {


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        boolean[] used = new boolean[nums.length];
        if (nums.length == 0) {
            return result;
        }
        dfs(nums, path, used, result);
        return result;
    }


    public void dfs(int[] nums, List<Integer> path, boolean[] used, List<List<Integer>> result) {

        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                path.add(nums[i]);
                used[i] = true;
                dfs(nums, path, used, result);
                path.remove(path.size() - 1);
                used[i] = false;
            }

        }

    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(new Solution46().permute(nums));
    }

}

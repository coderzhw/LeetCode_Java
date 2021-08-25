package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 组合总和 II
 * @date: 2021-08-25 10:35
 */

public class Solution40 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, path, result);
        return result;
    }

    public void dfs(int[] candidates, int target, int depth, List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
        }
        if (target < 0) {
            return;
        }
        for (int i = depth; i < candidates.length; i++) {
            if (i > depth && candidates[i] == candidates[i - 1]) {
                continue;
            }
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        System.out.println(new Solution40().combinationSum2(candidates, target));
    }
}

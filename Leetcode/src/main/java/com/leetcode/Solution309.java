package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 组合总和
 * @date: 2021-08-25 09:55
 */

public class Solution309 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
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
            path.add(candidates[i]);
            dfs(candidates, target - candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        int target = 8;
        System.out.println(new Solution309().combinationSum(candidates, target));
    }


}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 组合总和 III
 * @date: 2021-08-25 10:48
 */

public class Solution216 {


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(k, n, 1, path, result);
        return result;
    }

    public void dfs(int k, int target, int depth, List<Integer> path, List<List<Integer>> result) {
        if (target == 0 && path.size() == k) {
            result.add(new ArrayList<>(path));
        }
        if (target < 0) {
            return;
        }
        for (int i = depth; i <= 9; i++) {
            path.add(i);
            dfs(k, target - i, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        System.out.println(new Solution216().combinationSum3(k, n));
    }


}

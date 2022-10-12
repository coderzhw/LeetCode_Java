package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 组合
 * @date: 2021-08-24 18:33
 */

public class Solution77 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(n, 1, k, path, result);
        return result;
    }

    public void dfs(int n, int depth, int k, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = depth; i <= n; i++) {
            path.add(i );
            dfs(n, i + 1, k, path, result);
            path.remove(path.size() - 1);
        }
    }


    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        System.out.println(new Solution77().combine(n, k));
    }

}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 组合总和 Ⅳ
 * @date: 2021-08-25 11:03
 */

public class Solution377 {

    public int result=0;
    //暴力搜索超时，必须要动态规划
    public int combinationSum4(int[] nums, int target) {

        List<Integer> path = new ArrayList<>();
        dfs(nums, target, path);
        return result;
    }

    public void dfs(int[] nums, int target, List<Integer> path) {
        if (target == 0) {
            result+=1;
        }
        if (target < 0) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, target - nums[i],  path);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = {3,2,1};
        int target = 4;
        System.out.println(new Solution377().combinationSum4(candidates, target));
    }


}

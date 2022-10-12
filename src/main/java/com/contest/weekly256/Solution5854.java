package com.contest.weekly256;


import com.leetcode.Solution75;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 学生分数的最小差值
 */

public class Solution5854 {


    int result = Integer.MAX_VALUE;

    public int minimumDifference2(int[] nums, int k) {
        List<Integer> path = new ArrayList<>();
        dfs(nums, k, 0, path);
        System.out.println(result);
        return result;
    }

    public void dfs(int[] nums, int k, int depth, List<Integer> path) {
        if (path.size() == k) {
            List<Integer> newPath = new ArrayList<>(path);
            int tmp = Collections.max(newPath) - Collections.min(newPath);
            if (tmp < result) {
                result = tmp;
            }
            return;
        }
        for (int i = depth; i < nums.length; i++) {
            path.add(nums[i]);
            dfs(nums, k, i + 1, path);
            path.remove(path.size() - 1);
        }
    }

    public int minimumDifference(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        if (list.size() == 1) {
            return 0;
        }
        Collections.sort(list, (o1, o2) -> o2 - o1);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (i + k - 1 < list.size()) {
                int tmp = list.get(i) - list.get(i + k - 1);
                if (result > tmp) {
                    result = tmp;
                }
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {41900, 69441, 94407, 37498, 20299, 10856, 36221, 2231, 54526, 79072, 84309, 76765, 92282, 13401, 44698, 17586, 98455, 47895, 98889, 65298, 32271, 23801, 83153, 12186, 7453, 79460, 67209, 54576, 87785, 47738, 40750, 31265, 77990, 93502, 50364, 75098, 11712, 80013, 24193, 35209, 56300, 85735, 3590, 24858, 6780, 50086, 87549, 7413, 90444, 12284, 44970, 39274, 81201, 43353, 75808, 14508, 17389, 10313, 90055, 43102, 18659, 20802, 70315, 48843, 12273, 78876, 36638, 17051, 20478};
        int k = 5;
        System.out.println(new Solution5854().minimumDifference(nums, k));
    }
}

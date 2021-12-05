package com.contest.weekly270;

import java.util.*;

public class Solution5942 {

    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        List<Integer> path = new ArrayList<>();
        boolean[] used = new boolean[digits.length];
        dfs(digits, path, used, set);
        if (set.size() == 0) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }


    public void dfs(int[] nums, List<Integer> path, boolean[] used, Set<Integer> result) {

        if (path.size() == 3) {
            List<Integer> numPath = new ArrayList<>(path);
            int num = 100 * numPath.get(0) + 10 * numPath.get(1) + numPath.get(2);
            if (num >= 100 && num % 2 == 0) {
                result.add(num);
            }
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
        int[] digits = {3,7,5};
        System.out.println(Arrays.toString(new Solution5942().findEvenNumbers(digits)));
    }
}

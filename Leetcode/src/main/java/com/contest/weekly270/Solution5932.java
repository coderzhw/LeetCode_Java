package com.contest.weekly270;

import java.util.ArrayList;
import java.util.List;

public class Solution5932 {

    public List<List<int[]>> validArrangement(int[][] pairs) {
        List<int[]> path = new ArrayList<>();
        boolean[] used = new boolean[pairs.length];
        List<List<int[]>> result=new ArrayList<>();
        dfs(pairs, path, used,result);

        return result;


    }


    public void dfs(int[][] pairs, List<int[]> path, boolean[] used, List<List<int[]>> result) {
        if (path.size() == pairs.length) {
            boolean flag = true;
            for (int i = 0; i < path.size() - 1; i++) {
                if (path.get(i)[0] != path.get(i + 1)[1]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.add(new ArrayList<>(path));
            }
            return;
        }
        for (int i = 0; i < pairs.length; i++) {
            if (!used[i]) {
                path.add(pairs[i]);
                used[i] = true;
                dfs(pairs, path, used,result);
                path.remove(path.size() - 1);
                used[i] = false;
            }

        }
    }

    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {1, 3}, {2, 1}};
        System.out.println(new Solution5932().validArrangement(pairs));
    }
}

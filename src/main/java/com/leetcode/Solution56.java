package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 合并区间
 * @date: 2021-08-31 15:13
 */

public class Solution56 {

    public int[][] merge(int[][] intervals) {
        //先按照开始时间排序
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            //不重叠直接加
            if (intervals[i][0] > result.get(result.size() - 1)[1]) {
                result.add(intervals[i]);
            }
            //重叠需要合并
            if (intervals[i][0] <= result.get(result.size() - 1)[1] && intervals[i][0] >=result.get(result.size() - 1)[0]) {
                intervals[i][0] = Math.min(intervals[i][0], result.get(result.size() - 1)[0]);
                intervals[i][1] = Math.max(intervals[i][1], result.get(result.size() - 1)[1]);
                result.remove(result.size() - 1);
                result.add(intervals[i]);
            }
            if (intervals[i][1] < result.get(result.size() - 1)[0]) {
                result.add(intervals[i]);
            }
        }
        return result.toArray(new int[0][]);
    }


    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {1, 5}};
        System.out.println(Arrays.deepToString(new Solution56().merge(intervals)));

    }


}

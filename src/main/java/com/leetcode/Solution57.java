package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 插入区间
 * @date: 2021-08-31 09:04
 */

public class Solution57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        List<int[]> list=new ArrayList<>();
        int len=intervals.length;
        //左侧没重叠
        while (i<len &&intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        //中间重叠的部分
        while (i<len&& intervals[i][0]<=newInterval[1]){
            int[] tmp=new int[2];
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }
        list.add(newInterval);
        while (i<len){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals={};
        int[] newInterval={2,5};
        System.out.println(Arrays.deepToString(new Solution57().insert(intervals,newInterval)));
    }

}

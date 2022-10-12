package com.leetcode;

/**
 * @author : zhangwei
 * @description : 直线上最多的点数
 * @date: 2021-09-01 15:07
 */

public class Solution149 {


    public int maxPoints(int[][] points) {
        int ans = 0;
        int n = points.length;
        if(points.length<=2) return points.length;
        for (int i = 0; i < n; i++) {
            int[] x = points[i];
            for (int j = i + 1; j < n; j++) {
                int[] y = points[j];
                int cnt = 2;
                for (int k = j + 1; k < n; k++) {
                    int[] p = points[k];
                    //求p和x, y和x的斜率是否相等，相等就加一，这里不能用除法，可能除不尽，改成判断乘法
                    int s1 = (y[1] - x[1]) * (p[0] - y[0]);
                    int s2 = (p[1] - y[1]) * (y[0] - x[0]);
                    if (s1 == s2) cnt++;
                    ans = Math.max(ans, cnt);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] points={{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        System.out.println(new Solution149().maxPoints(points));
    }
}

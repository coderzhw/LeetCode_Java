package com.first.leetcode;

/**
 * 盛水最多的容器
 * Created by zhangwei03 on 2019/9/4.
 */
public class Solution11 {

    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return maxarea;
    }

    public static void main(String[] args) {

    }


}

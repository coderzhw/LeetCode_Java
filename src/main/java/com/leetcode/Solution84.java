package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 柱状图中最大的矩形
 * @date: 2021-08-12 09:48
 */

public class Solution84 {


    public int largestRectangleArea(int[] heights) {
        int[] new_heights = new int[heights.length + 2];
        //首尾加0为了方便出栈
        for (int i = 1; i < new_heights.length - 1; i++) {
            new_heights[i] = heights[i - 1];
        }
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < new_heights.length; i++) {
            while (!stack.isEmpty() && new_heights[stack.peek()] > new_heights[i]) {
                int cur = stack.pop();
                int left = stack.peek() + 1;
                int right = i - 1;
                result = Math.max(result, (right - left + 1) * new_heights[cur]);
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] height = {2, 1, 5, 6, 2, 3};
        System.out.println(new Solution84().largestRectangleArea(height));
    }

}

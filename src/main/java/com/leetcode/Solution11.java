package com.leetcode;

/**
 * @author : zhangwei
 * @description : 盛最多水的容器
 * @date: 2021-09-10 10:32
 */

public class Solution11 {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                result = Math.max((right - left) * height[left], result);
                left++;
            } else {
                result = Math.max((right - left) * height[right], result);
                right--;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(new Solution11().maxArea(height));
    }


}

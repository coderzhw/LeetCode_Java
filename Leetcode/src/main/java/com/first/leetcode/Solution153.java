package com.first.leetcode;

/**
 * 寻找旋转排序数组中的最小值
 * Created by zhangwei03 on 2019/10/10.
 */
public class Solution153 {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            //注意这里没有重复元素,否则不能这么写
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }

}

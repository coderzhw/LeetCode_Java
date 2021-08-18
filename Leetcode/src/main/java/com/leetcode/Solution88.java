package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 合并两个有序数组
 * @date: 2021-08-18 15:41
 */

public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums = new int[m + n];
        int i, p, q;
        i = p = q = 0;
        while (p < m && q < n) {
            if (nums1[p] < nums2[q]) {
                nums[i++] = nums1[p++];
            } else {
                nums[i++] = nums2[q++];
            }
        }
        while (p < m) {
            nums[i++] = nums1[p++];
        }
        while (q < n) {
            nums[i++] = nums2[q++];
        }
        System.arraycopy(nums, 0, nums1, 0, nums.length);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        new Solution88().merge(nums1, m, nums2, n);
    }
}

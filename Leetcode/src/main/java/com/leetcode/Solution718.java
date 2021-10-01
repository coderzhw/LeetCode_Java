package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最长重复子数组
 * @date: 2021-09-30 10:51
 */

public class Solution718 {

    public int findLength(int[] nums1, int[] nums2) {
        int result = 0;
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                result = Math.max(result, dp[i][j]);
            }
        }
        return result;
    }


}

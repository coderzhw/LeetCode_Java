package com.leetcode;

/**
 * H-Index II
 */
public class Solution275 {

    public int hIndex(int[] citations) {

        int left = 0;
        int right = citations.length - 1;
        int n = citations.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return n - left;

    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 5, 6};
        System.out.println(new Solution275().hIndex(nums));
    }


}

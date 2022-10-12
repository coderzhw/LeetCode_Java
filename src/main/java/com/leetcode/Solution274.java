package com.leetcode;

import java.util.Arrays;

/**
 * H 指数
 */
public class Solution274 {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        int i = citations.length - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 6, 1, 5};
        System.out.println(new Solution274().hIndex(nums));
    }
}

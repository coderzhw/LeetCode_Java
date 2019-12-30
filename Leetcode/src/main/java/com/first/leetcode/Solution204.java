package com.first.leetcode;

/**
 * 计数质数
 */
public class Solution204 {

    public static int countPrimes(int n) {
        int count = 0;
        boolean[] nums = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!nums[i]) {
                for (int j = 2; j * i < n; j++) {
                    nums[j*i] = true;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
}

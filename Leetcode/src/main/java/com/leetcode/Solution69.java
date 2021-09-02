package com.leetcode;

/**
 * @author : zhangwei
 * @description : x 的平方根
 * @date: 2021-09-01 16:32
 */

public class Solution69 {

    public int mySqrt(int x) {

        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(mid==0) return x;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(new Solution69().mySqrt(2147395599));
    }


}

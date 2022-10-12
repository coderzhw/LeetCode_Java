package com.leetcode;

/**
 * @author : zhangwei
 * @description : 爬楼梯
 * @date: 2021-06-04 16:03
 */

public class Solution70 {

    public static int climbStairs(int n) {
        int prve = 0, cur = 1;
        for (int i = 1; i <= n; i++) {
            int tmp = cur;
            cur = cur + prve;
            prve = tmp;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}

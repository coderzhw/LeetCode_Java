package com.first.leetcode;

/**
 * 有效的完全平方数
 * Created by zhangwei03 on 2019/10/11.
 */
public class Solution367 {

    public static boolean isPerfectSquare(int num) {
        for (int i = 1; i <=(num/2+1); i++) {
            int a = i * i;
            if (a > num) {
                return false;
            } else if (a == num) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPerfectSquare(1));
    }
}

package com.test.leetcode;

/**
 * 斐波那契数
 */
public class Solution509 {
    public static int fib(int N) {
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        return fib(N-1)+fib(N-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(3));
    }
}

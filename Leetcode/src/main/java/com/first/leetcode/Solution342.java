package com.first.leetcode;

public class Solution342 {

    public static boolean isPowerOfFour(int num) {
        while(num!=0 && (num%4==0)){
            num=num/4;
        }
        return num==1;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }

}

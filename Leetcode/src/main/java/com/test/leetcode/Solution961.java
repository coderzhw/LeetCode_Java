package com.test.leetcode;

import java.util.Arrays;

/**
 * 重复 N 次的元素
 */
public class Solution961 {

    public static int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int count=A.length/2;
        if(A[count+1]==A[count]){
            return A[count];
        }
        return A[count-1];
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}

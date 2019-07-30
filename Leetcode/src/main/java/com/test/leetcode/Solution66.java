package com.test.leetcode;

import java.util.Arrays;

/**
 * 加一
 * Created by zhangwei03 on 2019/7/26.
 */
public class Solution66 {

    public static int[] plusOne(int[] digits) {
        int size = digits.length;
        for (int i = size - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                //末尾为9 的情况
                digits[i] = 0;
            }
        }
        //全为9的情况
        int[] arr = new int[size + 1];
        arr[0] = 1;
        return arr;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{1, 2, 9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

}

package com.first.leetcode;


import java.util.Arrays;

/**
 * 两数之和 II - 输入有序数组
 * Created by zhangwei03 on 2019/8/7.
 */
public class Solution167 {


    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int index2 = binarysearch(numbers, i + 1, numbers.length-1, target - numbers[i]);
            if (index2 != -1) {
                result[0] = i + 1;
                result[1] = index2+1;
                break;
            }
        }
        return result;

    }

    public static int binarysearch(int array[], int low, int high, int target) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (array[mid] > target) {
            return binarysearch(array, low, mid - 1, target);
        }
        if (array[mid] < target) {
            return binarysearch(array, mid + 1, high, target);
        }
        return mid;
    }


    public static void main(String[] args) {
        int[] nums={5,25,75};
        int target=100;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}

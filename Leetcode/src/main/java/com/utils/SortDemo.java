package com.utils;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 几种排序算法的例子
 * @date: 2021-08-16 14:34
 */

public class SortDemo {

    public static void bubleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    swap(nums, j + 1, j);
                }
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[index] < nums[j]) {
                    index = j;
                }
            }
            swap(nums, index, i);
            System.out.println(Arrays.toString(nums));
        }
    }


    public static void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] > nums[j + 1]) {
                    swap(nums, j, j + 1);
                } else {
                    break;
                }
            }
            System.out.println(Arrays.toString(nums));
        }


    }

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = getMid(nums, left, right);
        quickSort(nums, left, mid - 1);
        quickSort(nums, mid + 1, right);

        System.out.println(Arrays.toString(nums));
    }


    public static int getMid(int[] nums, int left, int right) {
        int start = left;
        int end = right;
        int flag = nums[start];
        while (start < end) {
            while (nums[end] >= flag && start < end) {
                end--;
            }
            while (nums[start] <= flag && start < end) {
                start++;
            }
            swap(nums, start, end);
        }
        swap(nums, start, left);
        return start;
    }


    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 7, 2, 4};
        //  bubleSort(nums);
        // selectSort(nums);
        // insertSort(nums);
        quickSort(nums, 0, nums.length - 1);
    }

}

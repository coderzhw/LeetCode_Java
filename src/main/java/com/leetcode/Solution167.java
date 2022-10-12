package com.leetcode;

import java.util.Arrays;

/**
 * 两数之和 II - 输入有序数组
 */
public class Solution167 {

    public static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low<high){
            int sum=numbers[low]+numbers[high];
            if(sum>target){
                high--;
            }else if(sum<target){
                low++;
            }else {
                return new int[]{low+1,high+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {-1,0};
        System.out.println(Arrays.toString(twoSum(nums, -1)));
    }

}

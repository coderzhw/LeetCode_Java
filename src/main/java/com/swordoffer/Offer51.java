package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 数组中的逆序对
 * @date: 2021-11-15 11:14
 */

public class Offer51 {

    int count = 0;

    public int reversePairs(int[] nums) {
        segment(nums, 0, nums.length - 1);
        return count;
    }


    public void segment(int[] nums, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        segment(nums, left, mid);
        segment(nums, mid + 1, right);
        merge(nums, left, right, mid);
    }


    public void merge(int[] nums, int left, int right, int mid) {
        int[] tmpArr = new int[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int i = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (nums[leftIndex] <= nums[rightIndex]) {
                tmpArr[i++] = nums[leftIndex++];
            } else {
                tmpArr[i++] = nums[rightIndex++];
                //归并排序这里很巧妙，就这一行最关键
                count += (mid - leftIndex + 1);
            }
        }
        while (leftIndex <= mid) {
            tmpArr[i++] = nums[leftIndex++];
        }
        while (rightIndex <= right) {
            tmpArr[i++] = nums[rightIndex++];
        }
        for (int j = 0; j < tmpArr.length; j++) {
            nums[left + j] = tmpArr[j];
        }
    }

}

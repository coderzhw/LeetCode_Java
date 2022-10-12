package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 在排序数组中查找数字 I
 * @date: 2021-10-13 14:37
 */

public class Offer53I {

    public int search(int[] nums, int target) {
        int result = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                int tmpR = mid ;
                while (tmpR < nums.length && nums[tmpR] == target) {
                    ++result;
                    tmpR++;
                }
                int tmpL = mid - 1;
                while (tmpL >= 0 && nums[tmpL] == target) {
                    tmpL--;
                    ++result;
                }
                return result;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        System.out.println(new Offer53I().search(nums, 8));
    }
}

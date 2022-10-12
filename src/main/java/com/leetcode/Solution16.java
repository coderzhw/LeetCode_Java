package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 最接近的三数之和
 * @date: 2021-06-08 16:24
 */

public class Solution16 {


    public static int threeSumClosest(int[] nums, int target) {
        //先排序
        Arrays.sort(nums);
        //弄两个指针去找合适的值
        int result = nums[0]+nums[1]+nums[2];
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0;
            while (low < high) {
                sum = current + nums[low] + nums[high];
                if (Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                }
                if (sum - target < 0) {
                    low++;
                } else if (sum - target > 0) {
                    high--;
                } else {
                    return sum;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println(threeSumClosest(nums, target));
    }
}

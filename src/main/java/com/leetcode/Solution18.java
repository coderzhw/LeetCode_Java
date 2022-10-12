package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 四数之和
 * (要注意j>i+1这个条件)
 */
public class Solution18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums.length < 4) {
            return result;
        }
        //先排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int b = nums[j];
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = a + b + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> tmpList = Arrays.asList(a, b, nums[left], nums[right]);
                        result.add(tmpList);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }


                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,-1,-1,1,1,2,2};
        System.out.println(fourSum(nums, 0));
    }

}

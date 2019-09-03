package com.test.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和
 * Created by zhangwei03 on 2019/9/3.
 */
public class Solution15 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //先从小到大排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //如果最小的数大于0，则停止循环
            if (nums[i] > 0) {
                break;
            }
            //如果后一个数字和前一个相同，则跳过本次循环
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = 0 - nums[i];
            int j = nums.length - 1;
            int k = i + 1;
            while (k < j) {
                if (nums[k] + nums[j] == target) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[j]);
                    result.add(list);
                    //去除重复的结果
                    while (k < j && nums[k] == nums[k + 1]) {
                        k++;
                    }
                    while (k < j && nums[j] == nums[j - 1]) {
                        j--;
                    }
                    k++;
                    j--;
                } else if (nums[k] + nums[j] < target) {
                    k++;
                } else {
                    j--;
                }

            }

        }
        return result;
    }


    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}

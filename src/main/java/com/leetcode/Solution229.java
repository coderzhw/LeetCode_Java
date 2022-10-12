package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 求众数 II
 * @date: 2021-06-02 14:28
 */

public class Solution229 {

    public static List<Integer> majorityElement(int[] nums) {
        //设两个标志位，摩尔投票法
        int result1 = nums[0], count1 = 0, result2 = nums[0], count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (result1 == nums[i]) {
                count1++;
            } else if (result2 == nums[i]) {
                count2++;
            } else {
                if (count1 == 0) {
                    result1 = nums[i];
                    count1 = 1;
                } else if (count2 == 0) {
                    result2 = nums[i];
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }
        }
        //检查得到的结果是否一定满足大于n/3
        List<Integer> array = new ArrayList<>();
        int count1Check = 0, count2Check = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == result1) {
                count1Check++;
            } else if (nums[i] == result2) {
                count2Check++;
            }
        }
        if (count1Check > nums.length / 3) {
            array.add(result1);
        }
        if (count2Check > nums.length / 3) {
            array.add(result2);
        }
        return array;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 2, 3, 1, 1};
        System.out.println(majorityElement(nums));
    }


}

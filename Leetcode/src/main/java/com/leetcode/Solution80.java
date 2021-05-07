package com.leetcode;

/**
 * @author : zhangwei
 * @description : 删除有序数组中的重复项 II
 * @date: 2021-05-06 15:09
 */

public class Solution80 {


    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int slow = 0;
        int count = 1;
        for (int fast = 1; fast < len; fast++) {
            if (nums[fast] == nums[slow]) {
                count++;
                if (count <= 2) {
                    slow++;
                    nums[slow] = nums[fast];
                }
            } else {
                count = 1;
                slow++;
                nums[slow] = nums[fast];
            }

        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }
    }

}

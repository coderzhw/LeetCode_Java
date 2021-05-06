package com.leetcode;

/**
 * @author : zhangwei
 * @description : 删除有序数组中的重复项
 * @date: 2021-05-06 10:38
 */

public class Solution26 {

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int slow = 0;
        for (int fast = 0; fast < len; fast++) {
            if (nums[fast] == nums[slow]) {
                continue;
            } else {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]+ ",");
        }
    }

}

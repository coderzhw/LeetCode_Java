package com.first.leetcode;

import java.util.Arrays;

/**求众数
 * Created by zhangwei03 on 2019/7/24.
 */
public class Solution169 {

    public static int majorityElement(int[] nums) {
        int index = nums.length / 2;
        Arrays.sort(nums);
        return nums[index];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}

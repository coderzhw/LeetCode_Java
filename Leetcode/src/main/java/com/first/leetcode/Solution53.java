package com.first.leetcode;

/**
 * 最大子序和
 * Created by zhangwei03 on 2019/11/22.
 */
public class Solution53 {

    public static int maxSubArray(int[] nums) {
        int result = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum + num > num) {
              sum=sum+num;
            }else {
                sum=num;
            }
            result=Math.max(sum,result);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums={-2,-1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

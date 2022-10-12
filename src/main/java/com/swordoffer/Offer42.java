package com.swordoffer;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 连续子数组的最大和
 * @date: 2021-10-13 14:59
 */

public class Offer42 {

    public int maxSubArray(int[] nums) {
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        int result=dp[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i]>result){
                result=dp[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(new Offer42().maxSubArray(nums));
    }
}

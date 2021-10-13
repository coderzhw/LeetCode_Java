package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 0～n-1中缺失的数字
 * @date: 2021-10-13 11:01
 */

public class Offer53II {

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        return n*(n+1)/2-sum;
    }
}

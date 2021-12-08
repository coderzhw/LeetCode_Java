package com.leetcode;

/**
 * @author : zhangwei
 * @description : 寻找重复数
 * @date: 2021-12-07 15:25
 */

public class Solution287 {

    public int findDuplicate(int[] nums) {
        int slow,fast;
        slow=nums[0];
        fast=nums[nums[0]];
        while (slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        int p1=0;
        int p2=slow;
        while (p1!=p2){
            p1=nums[p1];
            p2=nums[p2];
        }
        return p1;
    }

}

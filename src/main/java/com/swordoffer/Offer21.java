package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 调整数组顺序使奇数位于偶数前面
 * @date: 2021-10-18 16:05
 */

public class Offer21 {
    public int[] exchange(int[] nums) {
        if(nums.length==0) return new int[0];
        int left=0,right=nums.length-1;
        while(left<right){
            if(nums[left]%2==1){
                left++;
            }else if(nums[right]%2==0){
                right--;
            }else{
                int tmp=nums[right];
                nums[right]=nums[left];
                nums[left]=tmp;
            }
        }
        return nums;
    }
}

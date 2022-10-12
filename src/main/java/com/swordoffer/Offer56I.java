package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 数组中数字出现的次数
 * @date: 2021-11-03 17:38
 */

public class Offer56I {


    public int[] singleNumbers(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        //取出二进制最右边的一位1
        int bit = ret & (-ret);
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & bit) == 0) {
                a ^= nums[i];
            } else {
                b ^= nums[i];
            }
        }
        return new int[]{a, b};
    }


}

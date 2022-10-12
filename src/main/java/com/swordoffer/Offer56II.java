package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 数组中数字出现的次数 II
 * @date: 2021-10-26 10:19
 */

public class Offer56II {

    public int singleNumber(int[] nums) {
        int[] cnt = new int[32];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < 32; j++) {
                cnt[j] += nums[i] & 1;
                cnt[j] = cnt[j] % 3;
                nums[i] = nums[i] >> 1;
            }
        }
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (cnt[i] << i);
        }
        return res;
    }
}

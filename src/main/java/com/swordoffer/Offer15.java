package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 二进制中1的个数
 * @date: 2021-10-12 09:30
 */

public class Offer15 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}

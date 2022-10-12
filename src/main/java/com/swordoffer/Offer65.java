package com.swordoffer;

/**
 * @author : zhangwei
 * @description :不用加减乘除做加法
 * @date: 2021-10-19 10:17
 */

public class Offer65 {
    public int add(int a, int b) {
        if(a==0 || b==0){
            return a^b;
        }
        return add(a^b,(a&b)<<1);
    }
}

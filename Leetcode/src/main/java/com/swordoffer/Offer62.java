package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 圆圈中最后剩下的数字
 * @date: 2021-10-19 09:40
 */

public class Offer62 {

    public int lastRemaining(int n, int m) {
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+m)%i;
        }
        return ans;
    }
}

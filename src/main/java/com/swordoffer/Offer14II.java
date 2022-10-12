package com.swordoffer;

/**
 * @author : zhangwei
 * @description :剪绳子 II
 * @date: 2021-10-28 15:09
 */

public class Offer14II {

    public int cuttingRope(int n) {
        return n <= 3 ? n - 1 : (int) process(n);
    }

    public long process(long n) {
        return n > 4 ? (process(n - 3) * 3 % 1000000007) : n;
    }


}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 求1+2+…+n
 * @date: 2021-10-19 15:15
 */

public class Offer64 {
    public int sumNums(int n) {
        int sum = n;
        boolean flag = (n > 1) && (sum = sum + sumNums(n - 1)) > 0;
        return sum;
    }
}

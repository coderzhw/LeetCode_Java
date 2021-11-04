package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 数字序列中某一位的数字
 * @date: 2021-11-04 16:42
 */

public class Offer44 {

    public int findNthDigit(int n) {
        long k=n;
        int i = 1;
        while (true) {
            if (i * Math.pow(10, i) > k) {
                String s = k / i + "";
                return s.charAt((int)(k % i))-'0';
            }
            k += Math.pow(10, i);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Offer44().findNthDigit(11));
    }


}

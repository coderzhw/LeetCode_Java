package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 左旋转字符串
 * @date: 2021-10-12 09:52
 */

public class Offer58 {

    public String reverseLeftWords(String s, int n) {
        String left=s.substring(0,n);
        String right=s.substring(n);
        return right+left;
    }
}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description :替换空格
 * @date: 2021-10-08 10:56
 */

public class Offer05 {

    //这个不是最优解，正解是双指针
    public String replaceSpace(String s) {
         return s= s.replace(" ","%20");
    }
}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 把字符串转换成整数
 * @date: 2021-11-09 08:31
 */

public class Offer67 {

    public int strToInt(String str) {
        char[] arr = str.trim().toCharArray();
        if (arr.length == 0) return 0;
        //正负号的标志位
        int sign = 1;
        //字符串的起始位置
        int index = 1;
        if (arr[0] == '-') {
            sign = -1;
        } else if (arr[0] != '+') {
            index = 0;
        }
        //防止溢出的标志位
        int maxFlag = Integer.MAX_VALUE / 10;
        int res = 0;
        for (int j = index; j < arr.length; j++) {
            if (!(arr[j] >= '0' && arr[j] <= '9')) break;
            if (res > maxFlag || (res == maxFlag && arr[j] > '7')) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (arr[j] - '0');
        }
        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(new Offer67().strToInt("-2147483647"));
    }

}

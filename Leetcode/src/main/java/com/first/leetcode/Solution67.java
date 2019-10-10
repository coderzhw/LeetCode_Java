package com.first.leetcode;

/**
 * 二进制求和
 * Created by zhangwei03 on 2019/10/10.
 */
public class Solution67 {

    public static String addBinary(String a, String b) {
        String result = "";
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        int sum = 0;
        while (aLen >= 0 || bLen >= 0) {
            if (aLen >= 0) {
                sum += a.charAt(aLen) - '0';
                aLen--;
            }
            if (bLen >= 0) {
                sum += b.charAt(bLen) - '0';
                bLen--;
            }
            if (sum == 0 || sum == 1) {
                result = sum + result;
                sum = 0;
            } else if (sum == 2) {
                result = "0" + result;
                sum = 1;
            } else if (sum == 3) {
                result = "1" + result;
                sum = 1;
            }
        }
        if (sum == 1) {
            result = "1" + result;
        }
        return result;
    }


    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

}

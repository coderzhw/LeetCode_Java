package com.leetcode;

/**
 * @author : zhangwei
 * @description : 字符串相乘
 * @date: 2021-08-30 14:30
 */

public class Solution43 {

    public String multiply(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        if (len1 == 0 || len2 == 0) {
            return "";
        }
        if (len1 == 1 && num1.equals("0") || len2 == 1 && num2.equals("0")) {
            return "0";
        }
        int[] res = new int[len1 + len2];
        for (int i = len1 - 1; i >= 0; i--) {
            for (int j = len2 - 1; j >= 0; j--) {
                int number1 = num1.charAt(i) - '0';
                int number2 = num2.charAt(j) - '0';
                int tmp = number1 * number2;
                tmp += res[i + j + 1];  //要加上进位
                res[i + j + 1] = tmp % 10;
                res[i + j] += tmp / 10;
            }
        }
        StringBuilder result = new StringBuilder();
        int k = res[0] == 0 ? 1 : 0;
        while (k < res.length) {
            result.append(res[k++]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution43().multiply("1234149","454"));
    }

}

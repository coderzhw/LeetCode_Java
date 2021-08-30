package com.leetcode;

/**
 * @author : zhangwei
 * @description : 字符串相加
 * @date: 2021-08-30 09:51
 */

public class Solution415 {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0 || sum != 0) {
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 10);
            sum = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "19";
        String num2 = "10";
        System.out.println(new Solution415().addStrings(num1, num2));
    }


}

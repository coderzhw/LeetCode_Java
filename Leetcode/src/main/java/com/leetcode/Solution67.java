package com.leetcode;

/**
 * @author : zhangwei
 * @description : 二进制求和
 * @date: 2021-08-30 14:09
 */

public class Solution67 {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0 || sum != 0) {
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            sum = sum / 2;
        }
        return result.reverse().toString();
    }


}

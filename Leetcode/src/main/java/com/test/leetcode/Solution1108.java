package com.test.leetcode;

/**
 * IP 地址无效化
 */
public class Solution1108 {
    public static String defangIPaddr(String address) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char s = address.charAt(i);
            if ('.' == s) {
                result.append("[.]");
            } else {
                result.append(s);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }
}

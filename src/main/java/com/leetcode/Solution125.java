package com.leetcode;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-07-15 11:20
 */

public class Solution125 {

    public boolean isPalindrome(String s) {
        StringBuilder romeStr = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                romeStr.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String tmp = new String(romeStr);
        return romeStr.reverse().toString().equals(tmp);
    }


    public static void main(String[] args) {
        System.out.println(new Solution125().isPalindrome("race a car"));
    }

}

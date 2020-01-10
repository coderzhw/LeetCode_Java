package com.first.leetcode;

/**
 * 同构字符串
 */
public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int length = s.length();
        for (char i = 0; i < length; i++) {
            if (s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }


}

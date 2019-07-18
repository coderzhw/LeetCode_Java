package com.test.leetcode;

/**
 * 旋转字符串
 */
public class Solution796 {

    public static boolean rotateString(String A, String B) {
        if(A.length()!=B.length()){
            return false;
        }
        if ((A + A).contains(B)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(rotateString("aa", "a"));
    }
}



package com.test.leetcode;

/**
 * 旋转字符串
 */
public class Solution796 {

    public static boolean rotateString(String A, String B) {
        if (!B.isEmpty() && B.length() > 0) {
            char[] arrB = B.toCharArray();
            char indexChar = arrB[0];
            if (!A .isEmpty() && A.length() > 0) {
                int indexNum = A.      indexOf(indexChar);
                if (indexNum != -1) {
                    String begin = A.substring(indexNum, A.length());
                    String end = A.substring(0, indexNum);
                    if (B.equals(begin + end)) {
                        return true;
                    }
                }
            }
        }else if("".equals(A)&& "".equals(B)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(rotateString("bbbacddceeb",  "ceebbbbacdd"));
    }
}



package com.test.leetcode;

public class Solution709 {
    public static String toLowerCase(String str) {
        StringBuilder result=new StringBuilder();
        for (int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a>='A' && a<='Z'){
                result.append((char)(a+32));
            }else {
                result.append(a);
            }

        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("A"));
    }
}

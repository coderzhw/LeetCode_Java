package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 字符串解码
 * @date: 2021-07-21 11:06
 */

public class Solution394 {

    public String decodeString(String s) {
        int muti = 0;
        StringBuilder res = new StringBuilder();
        Stack<Integer> muti_stack = new Stack<>();
        Stack<String> res_stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                muti = muti * 10 + s.charAt(i) - '0';
            } else if (s.charAt(i) == '[') {
                muti_stack.push(muti);
                res_stack.push(res.toString());
                muti = 0;
                res = new StringBuilder();
            } else if (s.charAt(i) == ']') {
               int muti_cur = muti_stack.pop();
                String str = res_stack.pop();
                StringBuilder tmp = new StringBuilder();
                for (int j = 0; j < muti_cur; j++) {
                    tmp.append(res.toString());
                }
                res=new StringBuilder(str+tmp);
            } else {
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "100[leetcode]";
        System.out.println(new Solution394().decodeString(s));
    }

}

package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 最长有效括号
 * @date: 2021-08-11 16:15
 */

public class Solution32 {

    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0, start = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                    if (!stack.isEmpty()) {
                        ans = Math.max(ans, i - stack.peek());
                    } else {
                        ans = Math.max(ans, i - start + 1);
                    }
                } else {
                    start = i + 1;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(new Solution32().longestValidParentheses(s));
    }
}

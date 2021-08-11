package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 有效的括号
 * @date: 2021-08-11 09:34
 */

public class Solution20 {

    public boolean isValid(String s) {
        String left = "({[";
        String right = ")}]";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (left.contains(Character.toString(c))) {
                stack.push(c);
            } else if (!stack.isEmpty() &&right.contains(Character.toString(c))) {
                char tmp = stack.peek();
                int index = left.indexOf(Character.toString(tmp));
                if (c == right.charAt(index)) {
                    stack.pop();
                } else {
                    return false;
                }
            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="}";
        System.out.println(new Solution20().isValid(s));
    }

}

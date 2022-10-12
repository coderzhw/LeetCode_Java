package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 逆波兰表达式求值
 * @date: 2021-08-11 10:16
 */

public class Solution150 {

    public int evalRPN(String[] tokens) {
        String flag = "+-*/";
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < tokens.length; i++) {
            if (!flag.contains(tokens[i])) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int x = stack.pop();
                int y= stack.pop();
                if ("+".equals(tokens[i])) {
                    stack.push(y + x);
                } else if ("-".equals(tokens[i])) {
                    stack.push(y - x);
                } else if ("*".equals(tokens[i])) {
                    stack.push(y * x);
                } else if ("/".equals(tokens[i])) {
                    stack.push(y / x);
                }
            }
        }
        return stack.peek();
    }


    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(new Solution150().evalRPN(tokens));
    }


}

package com.swordoffer;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 栈的压入、弹出序列
 * @date: 2021-11-05 11:12
 */

public class Offer31 {


    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for (int i = 0; i < pushed.length; i++) {
            stack.push(pushed[i]);
            while (!stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }


}

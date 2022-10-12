package com.swordoffer;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 用两个栈实现队列
 * @date: 2021-10-18 17:25
 */

public class Offer09 {


    class CQueue {
        Stack<Integer> stack;
        Stack<Integer> tmp;
        public CQueue() {
            stack = new Stack<>();
            tmp = new Stack<>();
        }
        public void appendTail(int value) {
            while (!stack.isEmpty()) {
                tmp.add(stack.pop());
            }
            stack.add(value);
            while (!tmp.isEmpty()) {
                stack.add(tmp.pop());
            }
        }
        public int deleteHead() {
            if (!stack.isEmpty()) {
                return stack.pop();
            }
            return -1;
        }
    }


}

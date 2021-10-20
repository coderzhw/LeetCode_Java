package com.swordoffer;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 包含min函数的栈
 * @date: 2021-10-19 14:56
 */

public class Offer30 {

    class MinStack {
        /**
         * initialize your data structure here.
         */
        public MinStack() {
            s = new Stack();
            miniStack = new Stack();
        }

        public void push(int x) {
            if (miniStack.isEmpty()) {
                miniStack.push(x);
            } else {
                int min = miniStack.peek() > x ? x : miniStack.peek();
                miniStack.push(min);
            }
            s.push(x);

        }

        public void pop() {
            s.pop();
            miniStack.pop();
        }

        public int top() {
            return s.peek();
        }

        public int min() {
            return miniStack.peek();
        }

        private Stack<Integer> s;
        private Stack<Integer> miniStack;
    }

}

package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-08-11 07:45
 */

public class Solution155 {

    static class MinStack {

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            s = new Stack<>();
            miniStack = new Stack<>();
        }

        public void push(int val) {
            if (!s.isEmpty()) {
                int min = miniStack.peek() < val ? miniStack.peek() : val;
                miniStack.push(min);
            } else {
                miniStack.push(val);
            }
            s.push(val);
        }

        public void pop() {
            s.pop();
            miniStack.pop();
        }

        public int top() {
            return s.peek();
        }

        public int getMin() {
            return miniStack.peek();
        }

        private Stack<Integer> s;
        private Stack<Integer> miniStack;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());

    }


}

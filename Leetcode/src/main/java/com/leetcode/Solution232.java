package com.leetcode;

import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 用栈实现队列
 * @date: 2021-08-11 11:07
 */

public class Solution232 {


    static class MyQueue {

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            stack = new Stack<>();
            tmp = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            while (!stack.isEmpty()) {
                tmp.push(stack.pop());
            }
            tmp.push(x);
            while (!tmp.isEmpty()) {
                stack.push(tmp.pop());
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return stack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return stack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack.isEmpty();
        }

        private Stack<Integer> stack;
        private Stack<Integer> tmp;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue.empty()); // return false
    }
}

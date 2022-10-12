package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhangwei
 * @description : 用队列实现栈
 * @date: 2021-08-11 10:45
 */

public class Solution225 {

    static class MyStack {

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            queue = new LinkedList<>();
            tmp = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            tmp.offer(x);
            while (!queue.isEmpty()){
                tmp.offer(queue.poll());
            }

            Queue<Integer> q=new LinkedList<>();
            q=queue;
            queue=tmp;
            tmp=q;
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
         return queue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
          return queue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return  queue.isEmpty();
        }

        private Queue<Integer> queue;
        private Queue<Integer> tmp;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // 返回 2
        System.out.println(myStack.pop()); // 返回 2
        System.out.println(myStack.empty()); // 返回 False
    }

}

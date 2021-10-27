package com.swordoffer;

import java.util.ArrayDeque;

/**
 * @author : zhangwei
 * @description : 队列的最大值
 * @date: 2021-10-27 10:37
 */

public class Offer59II {


    public static void main(String[] args) {
        MaxQueue max = new MaxQueue();
        max.push_back(1);
        max.push_back(3);
        max.push_back(2);
        max.pop_front();
        System.out.println(max.max_value());
        max.pop_front();
        System.out.println(max.max_value());
        max.pop_front();
        System.out.println(max.max_value());
    }


}

class MaxQueue {

    public MaxQueue() {
        queue = new ArrayDeque<>();
        maxQueue = new ArrayDeque<>();
    }

    public int max_value() {
        if (maxQueue.isEmpty()) return -1;
        return maxQueue.peek();
    }

    public void push_back(int value) {
        queue.add(value);
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < value) {
            maxQueue.pollLast();
        }
        maxQueue.addLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        if (queue.peek().equals(maxQueue.peek())) {
            maxQueue.poll();
        }
        return queue.poll();
    }

    private ArrayDeque<Integer> queue;
    private ArrayDeque<Integer> maxQueue;
}


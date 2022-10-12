package com.swordoffer;

import java.util.PriorityQueue;

/**
 * @author : zhangwei
 * @description : 数据流中的中位数
 * @date: 2021-11-10 16:05
 */

public class Offer41 {

    class MedianFinder {

        PriorityQueue<Integer> minHeap, maxHeap;


        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            maxHeap = new PriorityQueue<>((o1, o2) -> (o2 - o1));
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            if (maxHeap.size() == minHeap.size()) {
                maxHeap.add(num);
                minHeap.add(maxHeap.poll());

            } else {
                minHeap.add(num);
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() == minHeap.size()) {
                return (maxHeap.peek() + minHeap.peek()) / 2;
            }
            return minHeap.peek();
        }
    }
}

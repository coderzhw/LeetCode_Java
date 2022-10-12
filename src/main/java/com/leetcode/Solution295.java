package com.leetcode;

import java.util.PriorityQueue;

/**
 * @author : zhangwei
 * @description : 数据流的中位数
 * @date: 2021-08-11 14:00
 */

public class Solution295 {

    static class MedianFinder {

        /**
         * initialize your data structure here.
         */
        public MedianFinder() {
            //大根堆降序排列（存较小的数字），小根堆升序排列（存较大的数字）
            maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {
            maxHeap.offer(num);
            minHeap.offer(maxHeap.poll());
            if (maxHeap.size() < minHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }

        public double findMedian() {
            if (maxHeap.size() != minHeap.size()) {
                return maxHeap.peek();
            } else {
                return (minHeap.peek() + maxHeap.peek()) / 2.0;
            }
        }

        private PriorityQueue<Integer> maxHeap;
        private PriorityQueue<Integer> minHeap;
    }


    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }


}

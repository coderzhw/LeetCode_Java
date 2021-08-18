package com.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 数组中的第K个最大元素
 */
public class Solution215 {

    public static int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            queue.offer(nums[i]);
            if(queue.size()>k){
                queue.poll();
            }
        }
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        System.out.println(new Solution215().findKthLargest(nums, k));
    }
}

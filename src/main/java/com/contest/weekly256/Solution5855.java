package com.contest.weekly256;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 找出数组中的第 K 大整数
 */
public class Solution5855 {

    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o2.compareTo(o1);
            }
            return o2.length() - o1.length();
        });
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
      //      System.out.println(queue.peek());
            queue.poll();

        }
        return queue.peek();
    }

    public static void main(String[] args) {
        String[] nums = {"623986800", "3", "887298", "695", "794", "6888794705", "269409",
                "59930972", "723091307", "726368", "8028385786", "378585"
        };
        int k = 11;
        System.out.println(new Solution5855().kthLargestNumber(nums, k));
    }
}

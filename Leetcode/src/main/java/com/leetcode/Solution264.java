package com.leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 丑数 II
 * @date: 2021-08-25 16:42
 */

public class Solution264 {

    public int nthUglyNumber(int n) {
        Set<Long> s = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>((o1,o2)->Long.compare(o1,o2));
        int[] nums = {2, 3, 5};
        s.add(1L);
        queue.add(1L);
        for (int i = 1; i < n; i++) {
            long x = queue.poll();
            //System.out.println(x);
            for (int j = 0; j < nums.length; j++) {
                long tmp = x * nums[j];
                if (!s.contains(tmp)) {
                    s.add(tmp);
                    queue.add(tmp);
                }
            }
        }
        return queue.peek().intValue();
    }


    public static void main(String[] args) {
        System.out.println(new Solution264().nthUglyNumber(3));
    }
}

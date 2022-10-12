package com.swordoffer;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 丑数
 * @date: 2021-10-26 11:06
 */

public class Offer49 {
    public int nthUglyNumber(int n) {
        Set<Long> s = new HashSet<>();
        Queue<Long> queue = new PriorityQueue<>((o1, o2) -> Long.compare(o1, o2));
        s.add(1L);
        queue.add(1L);
        int[] nums = {2, 3, 5};
        for (int i = 1; i < n; i++) {
            long x = queue.poll();
            for (int j = 0; j < nums.length; j++) {
                long temp = x * nums[j];
                if (!s.contains(temp)) {
                    s.add(temp);
                    queue.add(temp);
                }
            }
        }
        return queue.peek().intValue();
    }
}

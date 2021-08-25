package com.leetcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * @author : zhangwei
 * @description : 超级丑数
 * @date: 2021-08-25 17:24
 */

public class Solution313 {

    public int nthSuperUglyNumber(int n, int[] primes) {

        Set<Long> s = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        s.add(1L);
        queue.add(1L);
        for (int i = 1; i < n; i++) {
            long x = queue.poll();
            for (int j = 0; j < primes.length; j++) {
                long tmp = primes[j] * x;
                if (!s.contains(tmp)) {
                    s.add(tmp);
                    queue.add(tmp);
                }
            }
        }
        return queue.peek().intValue();

    }

    public static void main(String[] args) {
        int n = 12;
        int[] primes = {2, 7, 13, 19};
        System.out.println(new Solution313().nthSuperUglyNumber(n, primes));
    }
}

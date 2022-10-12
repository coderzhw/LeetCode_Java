package com.swordoffer;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author : zhangwei
 * @description :最小的k个数
 * @date: 2021-10-12 09:43
 */

public class Offer40 {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) return new int[0];

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((o1, o2) -> {
            //如果o1<o2-->o1-o2<0-->o1排在o2前列
            //意思就是对于o1,o2两个参数，返回正数就是o1排在后面
            return -(o1 - o2);
        });
        int[] result = new int[k];
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            int tmp = queue.poll();
            result[i] = tmp;
        }

        return result;

    }
}

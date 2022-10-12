package com.swordoffer;

import java.util.PriorityQueue;

/**
 * @author : zhangwei
 * @description : 把数组排成最小的数
 * @date: 2021-10-27 09:27
 */

public class Offer45 {

    public String minNumber(int[] nums) {
        PriorityQueue<String> queue = new PriorityQueue<>((o1, o2) -> (o1 + o2).compareTo((o2 + o1)));
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i] + "");
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(queue.poll());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(new Offer45().minNumber(nums));
    }

}

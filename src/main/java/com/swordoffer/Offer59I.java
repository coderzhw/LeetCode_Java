package com.swordoffer;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author : zhangwei
 * @description : 滑动窗口的最大值
 * @date: 2021-11-15 17:16
 */

public class Offer59I {


    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if (len == 0 || k == 0) return new int[0];
        int[] res = new int[len - k + 1];
        Deque<Integer> deque = new LinkedList<>();
        //单调栈的典型应用
        for (int right = 0; right < len; right++) {
            while (!deque.isEmpty() && nums[right] >= nums[deque.peekLast()]) deque.removeLast();
            deque.addLast(right);
            int left = right - k + 1;
            while (deque.peekFirst() < left) deque.removeFirst();
            if (left >= 0) {
                res[left] = nums[deque.peekFirst()];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {7,2,4};
        int k = 2;
        System.out.println(Arrays.toString(new Offer59I().maxSlidingWindow(nums, k)));
    }
}

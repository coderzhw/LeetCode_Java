package com.leetcode;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 环形链表
 * @date: 2021-06-24 13:50
 */

public class Solution141 {

    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}

package com.leetcode;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description :环形链表II
 * @date: 2021-06-24 14:09
 */

public class Solution142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                //一个指针从头开始，一个从相遇点开始
                ListNode index1 = head;
                ListNode index2 = fast;
                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }


}

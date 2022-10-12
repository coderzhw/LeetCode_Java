package com.leetcode;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 排序链表
 * @date: 2021-11-19 14:37
 */

public class Solution148 {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode middle = getMiddleNode(head);
        ListNode rihghtHead = middle.next;
        middle.next = null;
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(rihghtHead);
        return mergeList(l1, l2);
    }

    //求链表中点的时候要注意偶数个是取前面的还是后面的作为中点，这一点很重要，导致fast的起点不同,此处是取前面的点
    public ListNode getMiddleNode(ListNode head) {
        ListNode slow, fast;
        slow = head;
        fast = head.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur=dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = (l1 != null ? l1 : l2);
        return dummy.next;
    }


}

package com.leetcode;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 合并K个升序链表
 * @date: 2021-08-18 16:46
 */

public class Solution23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode sum = null;
        for (int i = 0; i < lists.length; i++) {
            sum = mergeTwoLists(sum, lists[i]);
        }
        return sum;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode tmp = new ListNode(l1.val);
                cur.next = tmp;
                cur = cur.next;
                l1 = l1.next;
            } else {
                ListNode tmp = new ListNode(l2.val);
                cur.next = tmp;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return dummy.next;
    }
}

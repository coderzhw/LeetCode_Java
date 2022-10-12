package com.swordoffer;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 删除链表的节点
 * @date: 2021-10-13 10:23
 */

public class Offer18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode pre = dummy;
        while (cur != null) {
            ListNode next = cur.next;
            if (cur.val == val) {
                pre.next = next;
            }
            pre = cur;
            cur = next;
        }
        return dummy.next;
    }
}

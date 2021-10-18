package com.swordoffer;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 两个链表的第一个公共节点
 * @date: 2021-10-18 16:56
 */

public class Offer52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a, b;
        a = headA;
        b = headB;
        while (a != b) {
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }
        return a;
    }


}

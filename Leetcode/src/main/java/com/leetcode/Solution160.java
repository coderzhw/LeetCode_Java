package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description :相交链表
 * @date: 2021-06-24 15:48
 */

public class Solution160 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            if (p1 == null) {
                p1 = headB;
            }else {
                p1 = p1.next;
            }
            if (p2 == null) {
                p2 = headA;
            }else {
                p2 = p2.next;
            }
        }
        return p1;
    }


    public static void main(String[] args) {
        int[] aArr = {4, 1, 8, 4, 5};
        int[] bArr = {5, 0, 1, 8, 4, 5};
        ListNode headA = ListNodeUtils.create(aArr);
        ListNode headB = ListNodeUtils.create(bArr);
        ListNodeUtils.printList(getIntersectionNode(headA, headB));
    }


}

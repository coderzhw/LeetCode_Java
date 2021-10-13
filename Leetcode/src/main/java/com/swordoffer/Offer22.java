package com.swordoffer;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description :链表中倒数第k个节点
 * @date: 2021-10-13 10:32
 */

public class Offer22 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow, fast;
        slow = fast = head;
        //快指针先走K步
        int count = 0;
        while (count < k) {
            fast = fast.next;
            count++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode node = ListNodeUtils.create(arr);
        new Offer22().getKthFromEnd(node, 2);
    }
}

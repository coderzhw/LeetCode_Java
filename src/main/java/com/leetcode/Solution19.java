package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 删除链表的倒数第 N 个结点
 * @date: 2021-06-24 11:12
 */

public class Solution19 {

    //快慢指针
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode slow, fast;
        slow = fast = dummyNode;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(removeNthFromEnd(head, 1));
    }
}

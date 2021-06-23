package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 删除排序链表中的重复元素
 * @date: 2021-06-23 16:10
 */

public class Solution83 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
            //  ListNodeUtils.printList(dummyNode.next);
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        ListNode head = ListNodeUtils.create(arr);
        // ListNode head=null;
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(deleteDuplicates(head));
    }
}

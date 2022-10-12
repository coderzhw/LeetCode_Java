package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 删除排序链表中的重复元素 II
 * @date: 2021-06-23 17:07
 */

public class Solution82 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode cur = dummyNode;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int x = cur.next.val;
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }

        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(deleteDuplicates(head));
    }
}

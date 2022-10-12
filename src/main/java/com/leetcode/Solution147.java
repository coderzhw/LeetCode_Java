package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 对链表进行插入排序
 * @date: 2021-08-18 11:09
 */

public class Solution147 {

    public static ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        while (head != null && head.next != null) {
            if (head.val < head.next.val) {
                head = head.next;
                continue;
            }
            ListNode pre = dummy;
            ListNode cur = head.next;
            while (pre.next.val < cur.val) {
                pre = pre.next;
            }
            ListNode preNext = pre.next;
            head.next = cur.next;
            pre.next = cur;
            cur.next = preNext;
            //   ListNodeUtils.printList(dummy.next);
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr = {32, 4, 8, 3, 2};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(insertionSortList(head));
    }
}

package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : K 个一组翻转链表
 * @date: 2021-06-25 13:54
 */

public class Solution25 {


    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0, head);
        //pre是待翻转的K个节点的前一个节点，end是待翻转k个节点的最后一个节点
        ListNode pre, end;
        pre = end = dummyNode;
        while (end.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            //如果不够K个节点就直接不翻转返回即可
            if (end == null) {
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            ListNode newHead = reserve(start);
            pre.next = newHead;
            start.next = next;
            pre = end = start;
            ListNodeUtils.printList(dummyNode.next);
        }
        return dummyNode.next;
    }

    public static ListNode reserve(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(reverseKGroup(head, 1));
    }
}

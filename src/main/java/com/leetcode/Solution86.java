package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 分隔链表
 * @date: 2021-06-23 15:01
 */

public class Solution86 {


    public static ListNode partition(ListNode head, int x) {
        ListNode dummyLittleNode = new ListNode(-1000);
        ListNode dummyBigNode = new ListNode(1000);
        ListNode little = dummyLittleNode;
        ListNode big = dummyBigNode;
        while (head != null) {
            if (head.val < x) {
                //这里新建一个节点比复用原节点考虑的事情要少，复用原节点还需要将big.next置位Null，容易忽略
                ListNode tmp = new ListNode(head.val);
                little.next = tmp;
                little = little.next;
            }
            if (head.val >= x) {
                ListNode tmp = new ListNode(head.val);
                big.next = tmp;
                big = big.next;
            }
            head = head.next;
        }
        if (dummyBigNode.next != null) {
            little.next = dummyBigNode.next;
        }
        return dummyLittleNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(partition(head, 2));
    }

}

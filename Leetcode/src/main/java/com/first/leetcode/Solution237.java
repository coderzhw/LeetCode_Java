package com.first.leetcode;

/**
 * 删除链表中的节点
 * Created by zhangwei03 on 2019/10/21.
 */
public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

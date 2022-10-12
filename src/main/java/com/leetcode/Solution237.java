package com.leetcode;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 删除链表中的节点
 * @date: 2021-11-17 09:58
 */

public class Solution237 {

    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

package com.leetcode;

import com.utils.ListNode;
import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 有序链表转换二叉搜索树
 * @date: 2021-07-07 16:01
 */

public class Solution109 {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        ListNode middle = findMiddle(head);
        TreeNode root = new TreeNode(middle.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(middle.next);
        return root;
    }

    //快慢指针找中间节点
    private ListNode findMiddle(ListNode head) {
        ListNode slow, fast, preSlow;
        slow = fast = preSlow = head;
        while (fast != null && fast.next != null) {
            preSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        preSlow.next = null;
        return slow;
    }

}

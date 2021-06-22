package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 反转链表
 * @date: 2021-06-21 08:31
 */

public class Solution206 {

    //递归和迭代两种都要熟练掌握

    //迭代的方案
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            //先将下一个节点暂存再修改指针指向
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    //递归的方案
    public static ListNode reverseList2(ListNode head) {
        return reverseList(null, head);
    }

    public static ListNode reverseList(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        ListNode tmp = cur.next;
        cur.next = pre;
        pre = cur;
        cur = tmp;
        return reverseList(pre, cur);
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 3, 2};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        //翻转后再打印单链表
       // ListNode reverseHead = reverseList(head);
        ListNode reverseHead = reverseList2(head);
        ListNodeUtils.printList(reverseHead);
    }
}

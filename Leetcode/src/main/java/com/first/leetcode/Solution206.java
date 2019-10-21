package com.first.leetcode;

/**
 * 反转单链表
 * Created by zhangwei03 on 2019/10/21.
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode pre=null;
        ListNode current=head;
        while (current!=null){
            ListNode next=current.next;
            current.next=pre;
            pre=current;
            current=next;
        }
        return pre;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

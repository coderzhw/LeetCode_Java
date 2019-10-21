package com.first.leetcode;

/**
 * 移除链表元素
 * Created by zhangwei03 on 2019/10/21.
 */
public class Solution203 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode cur=new ListNode(-1);
        ListNode dummpy=cur;
        while(head!=null){
            if(head.val==val){
                cur.next=head.next;
            }else {
                cur.next=head;
                cur=cur.next;
            }
            head=head.next;
        }
        return dummpy.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

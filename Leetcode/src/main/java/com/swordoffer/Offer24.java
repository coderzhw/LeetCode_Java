package com.swordoffer;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 反转链表
 * @date: 2021-10-09 14:33
 */

public class Offer24 {

    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode cur=head;
        ListNode pre=null;
        while(cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
}

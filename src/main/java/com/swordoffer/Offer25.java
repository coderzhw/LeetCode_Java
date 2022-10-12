package com.swordoffer;

import com.utils.ListNode;

/**
 * @author : zhangwei
 * @description : 合并两个排序的链表
 * @date: 2021-10-11 17:04
 */

public class Offer25 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.next=l1;
        }
        if(l2!=null){
            cur.next=l2;
        }
        return dummy.next;
    }
}

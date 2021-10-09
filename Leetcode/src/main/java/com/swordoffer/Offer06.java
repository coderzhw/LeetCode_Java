package com.swordoffer;

import com.utils.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 从尾到头打印链表
 * @date: 2021-10-09 14:19
 */

public class Offer06 {
    public int[] reversePrint(ListNode head) {
        ListNode newHead=reverseListNode(head);
        List<Integer> list=new ArrayList<>();
        while(newHead!=null){
            list.add(newHead.val);
            newHead=newHead.next;
        }
        int num=list.size();
        int[] result=new int[num];
        for(int i=0;i<num;i++){
            result[i]=list.get(i);
        }
        return result;
    }

    public ListNode reverseListNode(ListNode head){
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

package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 删除排序链表中的重复元素 II
 * @date: 2021-06-23 17:07
 */

public class Solution82 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        ListNode p = dummyNode;
        ListNode pre=head;
        ListNode cur=head.next;
        while (cur != null) {

            if(pre.val==cur.val){
                pre=cur.next;
                cur=cur.next.next;



            }



            ListNode tmp = new ListNode(head.val);
            p.next = tmp;
            p = p.next;

        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(deleteDuplicates(head));
    }
}

package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 合并两个有序链表
 * @date: 2021-08-18 16:05
 */

public class Solution21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2!= null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            cur.next = l1;
        }
        if (l2 != null) {
            cur.next = l2;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,4};
        int[] arr2={1,3,4};
        ListNode l1 = ListNodeUtils.create(arr1);
        ListNode l2 = ListNodeUtils.create(arr2);
        ListNode result=new Solution21().mergeTwoLists(l1,l2);
        ListNodeUtils.printList(result);
    }
}

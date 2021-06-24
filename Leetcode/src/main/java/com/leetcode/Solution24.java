package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-06-24 14:33
 */

public class Solution24 {


    //要记得在纸上画图，指针一步步的移动，多创建中间变量
    public static ListNode swapPairs(ListNode head) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode cur = dummyNode;
        while (cur.next != null && cur.next.next != null) {
            ListNode tmp1 = cur.next;
            ListNode tmp2 = cur.next.next;
            cur.next = tmp2;
            tmp1.next = tmp2.next;
            tmp2.next = tmp1;
            ListNodeUtils.printList(dummyNode.next);
            cur = cur.next.next;
        }
        return dummyNode.next;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        swapPairs(head);
    }
}

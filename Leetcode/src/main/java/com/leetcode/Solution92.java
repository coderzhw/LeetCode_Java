package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 反转链表 II
 * @date: 2021-06-23 11:18
 */

public class Solution92 {

    //头插法
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        //新建一个虚拟节点
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        //guard一直在left这个节点的前面一个保持不动,point指向第一个需要翻转的节点
        ListNode guard = dummyNode;
        ListNode point = dummyNode.next;
        //找到需要翻转的节点前一个节点
        for (int i = 0; i < left - 1; i++) {
            guard = guard.next;
            point = point.next;
        }
        //循环处理需要反转的节点，采用头插法
        for (int i = 0; i < right - left; i++) {
            ListNode tmp = point.next;
            point.next = point.next.next;
            tmp.next = guard.next;
            guard.next = tmp;
           ListNodeUtils.printList(dummyNode.next);
        }
        return dummyNode.next;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        reverseBetween(head, 2, 4);
    }


}

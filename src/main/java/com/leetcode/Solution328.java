package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 奇偶链表
 * @date: 2021-06-22 09:46
 */

public class Solution328 {

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        //创建三个指针，分别记录奇偶节点的头结点和移动的指针（奇节点的头结点就是head,所以实际上是4个节点）
        ListNode odd = head, even = head.next, evenHead = head.next;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(oddEvenList(head));
    }

}

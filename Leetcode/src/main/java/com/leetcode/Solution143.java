package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 重排链表
 * @date: 2021-06-25 09:31
 */

public class Solution143 {

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        //1.快慢指针找到中点,将链表分成两半
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //这里为什么慢指针要往前走一步，分别以奇数个偶数个元素画个图即可观察出来
        ListNode slowHead = slow.next;
        slow.next = null;
        //2. 将后半段逆序
        ListNode newHead = reserve(slowHead);
        //3.合并两段链表,一个以head为头，一个以newHead为头
        while (head != null && newHead != null) {
            ListNode tmp1 = head.next;
            ListNode tmp2 = newHead.next;
            head.next = newHead;
            newHead.next = tmp1;
            head = tmp1;
            newHead = tmp2;
        }
    }

    public static ListNode reserve(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5};
        ListNode head = ListNodeUtils.create(arr);
        reorderList(head);
        ListNodeUtils.printList(head);
    }
}

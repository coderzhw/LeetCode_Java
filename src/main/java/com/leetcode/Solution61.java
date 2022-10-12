package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 旋转链表
 * @date: 2021-06-24 09:15
 */

public class Solution61 {

    //快慢指针方法
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        //1. 先计算出链表长度
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }
        //2. 快慢指针,快指针先移动K步
        ListNode slow, fast;
        slow = fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        //移动到链表末尾
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //重新连接链表
        ListNode newHead = slow.next;
        fast.next = head;
        slow.next = null;
        return newHead;

    }

    public static ListNode rotateRight1(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        //1.先算出链表长度(算长度的时候不能直接用head，否则后面的就没法用head了)
        int length = 0;
        ListNode cur = head;
        while (cur != null) {
            length++;
            cur = cur.next;
        }
        k = k % length;
        //2. 三次翻转得到最终结果
        head = reserve(head, 1, length - k);
        // ListNodeUtils.printList(head);
        head = reserve(head, length - k + 1, length);
        // ListNodeUtils.printList(head);
        head = reserve(head, 1, length);
        // ListNodeUtils.printList(head);
        return head;
    }

    //翻转从m到n的节点
    public static ListNode reserve(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode guard = dummyNode;
        ListNode point = dummyNode.next;
        //先把指针移到待移动左节点的前面一个
        for (int i = 0; i < left - 1; i++) {
            guard = guard.next;
            point = point.next;
        }
        //循环处理，采用头插法旋转链表的节点
        for (int i = 0; i < right - left; i++) {
            ListNode tmp = point.next;
            point.next = point.next.next;
            tmp.next = guard.next;
            guard.next = tmp;
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        int k = 0;
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(head);
        ListNodeUtils.printList(rotateRight(head, k));
    }
}

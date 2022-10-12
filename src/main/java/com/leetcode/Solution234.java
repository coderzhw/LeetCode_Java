package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 回文链表
 * @date: 2021-06-24 16:48
 */

public class Solution234 {

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        //快慢指针先找链表的中点
        ListNode slow, fast, cur;
        slow = fast = cur = head;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //链表长度为奇数的时候慢指针还是需要往前移一位，具体的画图即可知道了
        if (fast != null) {
            slow = slow.next;
        }

        //以slow为头结点，翻转后半部分，然后在从两头开始比较即可
        ListNode right = reserve(slow);
        ListNode left = head;
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }


        return true;
    }

    //翻转单链表
    public static ListNode reserve(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;

        }
        return pre;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 2,1};
        ListNode head = ListNodeUtils.create(arr);
        ListNodeUtils.printList(reserve(head));
        System.out.println(isPalindrome(head));
    }


}

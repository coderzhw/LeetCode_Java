package com.utils;

/**
 * @author : zhangwei
 * @description : 链表
 * @date: 2021-04-27 11:08
 */

public class ListNode {
    public ListNode next;
    public int val;


    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

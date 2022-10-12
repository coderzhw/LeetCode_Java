package com.utils;

import java.sql.SQLOutput;

/**
 * @author : zhangwei
 * @description : 链表相关的工具类
 * @date: 2021-06-21 08:33
 */

public class ListNodeUtils {

    // 创建链表
    public static ListNode create(int arr[]) {
        int n=arr.length;
        if (n == 0) {
            return null;
        }
        // 将数组的第一个元素赋给头指针
        ListNode head = new ListNode(arr[0]);
        ListNode curNode = head;
        // 依次赋值
        for (int i = 1; i < n; i++) {
            curNode.next = new ListNode(arr[i]);
            curNode = curNode.next;
        }
        return head;
    }

    // 打印链表
    public static void printList(ListNode head) {
        ListNode curNode = head;
        while (curNode != null) {
            System.out.print(curNode.val + "->");
            curNode = curNode.next;
        }
        System.out.print("NULL");
        System.out.println("\n");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {1, 4, 8, 3, 2};
        ListNode head = create(arr);
        printList(head);
    }


}

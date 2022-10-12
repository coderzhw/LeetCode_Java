package com.leetcode;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

/**
 * @author : zhangwei
 * @description : 两数相加
 * @date: 2021-06-22 15:10
 */

public class Solution2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode l = result;
        int carry = 0; //进位
        while (l1 != null || l2 != null) {
            int sum = 0; //加法和
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                sum = l1.val;
                l1 = l1.next;
            } else if (l2 != null) {
                sum = l2.val;
                l2 = l2.next;
            }
            if (carry > 0) {
                sum += carry;
                carry = 0;
            }
            if (sum >= 10) {
                carry = sum / 10;
                sum = sum % 10;
            }
            l.next = new ListNode(sum);
            l = l.next;
        }
        if (carry > 0) {
            l.next = new ListNode(carry);
        }
        return result.next;
    }


    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 9, 9, 9, 9};
        int[] arr2 = {9, 9, 9, 9};
        ListNode l1 = ListNodeUtils.create(arr1);
        ListNode l2 = ListNodeUtils.create(arr2);
        ListNodeUtils.printList(l1);
        ListNodeUtils.printList(l2);
        ListNode result = addTwoNumbers(l1, l2);
        ListNodeUtils.printList(result);
    }

}

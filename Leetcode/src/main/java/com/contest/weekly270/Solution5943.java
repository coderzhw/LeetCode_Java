package com.contest.weekly270;

import com.utils.ListNode;
import com.utils.ListNodeUtils;

public class Solution5943 {

    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int mid = getMidNode(head);
        ListNode pre = dummy;
        ListNode cur = dummy.next;
        int count = 0;
        while (cur != null) {
            if (count == mid) {
                pre.next = cur.next;
                break;
            } else {
                pre = cur;
                cur = cur.next;
                count++;
            }
        }
        return dummy.next;
    }

    public int getMidNode(ListNode head) {
        int result = 0;
        ListNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        ListNode head = ListNodeUtils.create(nums);
        ListNode newHead = new Solution5943().deleteMiddle(head);
        ListNodeUtils.printList(newHead);
    }


}

package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 复制带随机指针的链表
 * @date: 2021-06-25 15:33
 */

public class Solution138 {

    public static class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }



    static Map<Node, Node> copyMap = new HashMap<>();

    public static Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        //遍历两边的笨办法，也可以遍历一遍实现
        Node cur = head;
        while (cur != null) {
            copyMap.put(cur, new Node(cur.val));
            cur=cur.next;
        }
        Node p = head;
        while (p != null) {
            Node newNode=copyMap.get(p);
            newNode.next = copyMap.get(p.next);
            newNode.random = copyMap.get(p.random);
            p = p.next;
        }
        return copyMap.get(head);
    }


}

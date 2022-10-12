package com.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 复杂链表的复制
 * @date: 2021-11-08 11:03
 */

public class Offer35 {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<>();
        Node cur = head;
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        Node p = head;
        while (p != null) {
            Node newNode = map.get(p);
            newNode.next = map.get(p.next);
            newNode.random =  map.get(p.random);
            p = p.next;
        }
        return map.get(head);
    }


}

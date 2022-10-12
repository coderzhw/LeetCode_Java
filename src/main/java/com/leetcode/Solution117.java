package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhangwei
 * @description : 填充每个节点的下一个右侧节点指针 II
 * @date: 2021-07-02 10:00
 */

public class Solution117 {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    //按层遍历
    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList();
        Node pre, node;
        pre = node = null;
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                //每一层的第一个节点
                if (i == 0) {
                    pre = node = queue.remove();
                } else {
                    //修改指针的指向
                    node = queue.remove();
                    pre.next = node;
                    pre = pre.next;
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            pre.next = null;
        }
        return root;
    }


}

package com.leetcode;

public class Solution116 {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

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


    public static Node connect(Node root) {
        if(root==null){
            return null;
        }
        connect(root.left,root.right);
        return root;

    }

    public static void connect(Node left,Node right){
        if(left==null || right==null){
            return;
        }
        left.next=right;
        //这行代码不能要
        //right.next=null;
        connect(left.left,left.right);
        connect(right.left,right.right);
        connect(left.right,right.left);
    }
}

package com.first.leetcode;

import com.common.utils.TreeNode;

/**
 * 对称二叉树
 */
public class Solution101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null) {
            swapNode(right);
            if (isSameTree(left, right)) {
                return true;
            }
        }
        return false;
    }

    static void swapNode(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        swapNode(node.left);
        swapNode(node.right);
    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            int proot = p.val;
            int qroot = q.val;
            if (proot == qroot && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}

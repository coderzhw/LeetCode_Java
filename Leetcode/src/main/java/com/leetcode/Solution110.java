package com.leetcode;

import com.utils.TreeNode;

/**
 * 平衡二叉树
 */
public class Solution110 {
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return Math.abs(leftDepth - rightDepth) <= 1 && isBalanced(root.right) && isBalanced(root.left);
    }

    public static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(depth(root.right) , depth(root.left));
    }


}

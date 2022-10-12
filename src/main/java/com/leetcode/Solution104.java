package com.leetcode;


import com.utils.TreeNode;

/**
 * 二叉树的最大深度
 */
public class Solution104 {

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}

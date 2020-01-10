package com.first.leetcode;

import com.common.utils.TreeNode;

/**
 * 翻转二叉树
 */
public class Solution226 {

    public TreeNode invertTree(TreeNode node) {
        if (node == null) {
            return node;
        }
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        invertTree(node.left);
        invertTree(node.right);

        return node;
    }
}

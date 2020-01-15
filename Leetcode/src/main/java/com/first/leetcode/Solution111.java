package com.first.leetcode;

import com.common.utils.TreeNode;
import com.common.utils.TreeUtils;

/**
 * 二叉树的最小深度
 */
public class Solution111 {

    public static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        // null节点不参与比较
        if (root.left == null && root.right != null) {
            return 1 + minDepth(root.right);
        }
        // null节点不参与比较
        if (root.right == null && root.left != null) {
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode p = TreeUtils.createBinaryTreeByArray(new Integer[]{1,2},0);
        System.out.println(minDepth(p));

    }

}

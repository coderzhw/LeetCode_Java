package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description :平衡二叉树
 * @date: 2021-10-13 14:19
 */

public class Offer55II {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int left = getDepth(root.left);
        int right = getDepth(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    public int getDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(getDepth(root.left), getDepth(root.right)) + 1;
    }
}

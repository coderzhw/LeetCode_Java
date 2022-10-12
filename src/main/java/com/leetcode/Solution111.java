package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的最小深度
 * @date: 2021-07-02 09:33
 */

public class Solution111 {


    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if (root.left == null && root.right != null) {
            return 1 + rightDepth;
        }
        if (root.right == null && root.left != null) {
            return 1 + leftDepth;
        }
        return 1 + Math.min(leftDepth, rightDepth);
    }
}

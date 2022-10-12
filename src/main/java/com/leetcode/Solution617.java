package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 合并二叉树
 * @date: 2021-12-01 09:17
 */

public class Solution617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 != null && root2 != null) {
            TreeNode result = new TreeNode(root1.val + root2.val);
            result.left = mergeTrees(root1.left, root2.left);
            result.right = mergeTrees(root1.right, root2.right);
            return result;
        } else if (root1 != null && root2 == null) {
            return root1;
        } else if (root1 == null && root2 != null) {
            return root2;
        }
        return null;
    }


}

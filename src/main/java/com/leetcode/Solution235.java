package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉搜索树的最近公共祖先
 * @date: 2021-07-07 15:23
 */

public class Solution235 {


    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (Math.max(p.val, q.val) < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (Math.min(p.val, q.val) > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

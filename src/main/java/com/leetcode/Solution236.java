package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的最近公共祖先
 * @date: 2021-07-06 10:24
 */

public class Solution236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        if (find(root.left, p) && find(root.left, q)) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (find(root.right, p) && find(root.right, q)) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }


    //从一颗二叉树查找某个节点
    public boolean find(TreeNode root, TreeNode c) {
        if (root == null) {
            return false;
        }
        if (root == c) {
            return true;
        }

        return find(root.left, c) || find(root.right, c);
    }

}

package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的最近公共祖先
 * @date: 2021-10-18 10:44
 */

public class Offer68II {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root.val==p.val || root.val==q.val) return root;


        if (findNode(root.left, p) && findNode(root.left, q)) {
           return  lowestCommonAncestor(root.left, p, q);
        } else if (findNode(root.right, p) && findNode(root.right, q)) {
           return   lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    public boolean findNode(TreeNode root, TreeNode target) {
        if (root == null || target == null) return false;
        if (root.val == target.val) return true;
        return findNode(root.left, target) || findNode(root.right, target);
    }

}

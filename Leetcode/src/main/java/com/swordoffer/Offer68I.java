package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-10-18 11:04
 */

public class Offer68I {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

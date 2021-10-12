package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的深度
 * @date: 2021-10-12 09:54
 */

public class Offer55I {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}

package com.swordoffer;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的镜像
 * @date: 2021-10-11 17:08
 */

public class Offer27 {

    public TreeNode mirrorTree(TreeNode root) {
        if(root==null) return null;

        TreeNode left=mirrorTree(root.left);
        TreeNode right=mirrorTree(root.right);
        root.right=left;
        root.left=right;
        return root;
    }
}

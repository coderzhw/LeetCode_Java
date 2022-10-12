package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 翻转二叉树
 * @date: 2021-06-29 17:12
 */

public class Solution226 {


    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;

    }


}

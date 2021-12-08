package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 把二叉搜索树转换为累加树
 * @date: 2021-12-07 09:53
 */

public class Solution538 {

    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }


    public void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.right);
        sum += root.val;
        root.val = sum;
        dfs(root.left);
    }


}

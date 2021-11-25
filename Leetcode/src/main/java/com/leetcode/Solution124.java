package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树中的最大路径和
 * @date: 2021-11-24 14:16
 */

public class Solution124 {

    int maxResult = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxResult;
    }

    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        int ret = Math.max(root.val, root.val + Math.max(left, right));
        maxResult = Math.max(maxResult, Math.max(ret, root.val + left + right));
        return ret;
    }
}

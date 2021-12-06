package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 二叉树的直径(其实就是求深度和)
 * @date: 2021-12-06 16:25
 */

public class Solution543 {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root) {
        if (root == null) return 0;
        int left = dfs(root.left);
        int right = dfs(root.right);
        ans = Math.max(left + right, ans);
        return Math.max(left, right) + 1;
    }


}

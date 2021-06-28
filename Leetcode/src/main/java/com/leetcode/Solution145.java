package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉树的后序遍历
 * @date: 2021-06-28 17:47
 */

public class Solution145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }
}

package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉树的前序遍历
 * @date: 2021-06-28 17:18
 */

public class Solution144 {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;

    }

    void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }

}

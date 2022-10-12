package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 二叉树的中序遍历
 * @date: 2021-06-28 17:24
 */

public class Solution94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    static void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        inorder(root.left, result);
        result.add(root.val);
        inorder(root.right, result);
    }

    public static List<Integer> inorderTraver2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !s.empty()) {
            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            } else {
                cur = s.pop();
                result.add(cur.val);
                cur = cur.right;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraver2(root));
    }
}

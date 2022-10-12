package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 二叉树的前序遍历
 * @date: 2021-06-28 17:18
 */

public class Solution144 {

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(root, result);
        return result;

    }

    public static List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !s.isEmpty()) {
            if (cur != null) {
                res.add(cur.val); // root
                s.push(cur);
                cur = cur.left; // left
            } else {
                cur = s.pop();
                cur = cur.right; // right
            }
        }
        return res;
    }

    static void preOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        preOrder(root.left, result);
        preOrder(root.right, result);
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversal2(root));
    }

}

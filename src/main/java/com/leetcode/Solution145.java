package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zhangwei
 * @description : 二叉树的后序遍历
 * @date: 2021-06-28 17:47
 */

public class Solution145 {

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(root, result);
        return result;
    }

    static void postOrder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        postOrder(root.left, result);
        postOrder(root.right, result);
        result.add(root.val);
    }

    public static List<Integer> postTravel(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> resStack = new Stack<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !s.empty()) {
            if (cur != null) {
                s.push(cur);
                resStack.push(cur);
                cur = cur.right;

            } else {
                cur = s.pop();
                cur = cur.left;
            }
        }
        while (!resStack.empty()) {
            result.add(resStack.pop().val);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(postorderTraversal(root));
        System.out.println(postTravel(root));
    }
}

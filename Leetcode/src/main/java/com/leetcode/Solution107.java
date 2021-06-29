package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 二叉树的层序遍历 II
 * @date: 2021-06-29 16:57
 */

public class Solution107 {

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(list);
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(levelOrderBottom(root));
    }
}

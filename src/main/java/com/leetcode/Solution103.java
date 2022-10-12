package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.*;

/**
 * 二叉树的锯齿形层序遍历
 */
public class Solution103 {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean flag = false;
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
            if (flag) {
                Collections.reverse(list);
            }
            flag = !flag;
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 9, 20, null, null, 15, 7};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(zigzagLevelOrder(root));
    }

}

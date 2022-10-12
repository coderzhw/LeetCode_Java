package com.swordoffer;

import com.utils.TreeNode;

import java.util.*;

/**
 * 从上到下打印二叉树 III
 */
public class Offer32III {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> finalList = new ArrayList<>();
        if (root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            int k = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                TreeNode node = queue.poll();
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

        for (int i = 0; i < result.size(); i++) {
            if (i % 2 == 0) {
                finalList.add(result.get(i));
            } else {
                Collections.reverse(result.get(i));
                finalList.add(result.get(i));
            }
        }
        return finalList;
    }


}

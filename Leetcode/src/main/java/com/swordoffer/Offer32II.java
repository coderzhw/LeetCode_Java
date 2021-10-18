package com.swordoffer;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 从上到下打印二叉树 II
 * @date: 2021-10-18 15:41
 */

public class Offer32II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if(root==null) return result;
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
        return result;
    }


}

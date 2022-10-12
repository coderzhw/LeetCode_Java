package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zhangwei
 * @description : 二叉树的右视图
 * @date: 2021-06-29 17:04
 */

public class Solution199 {


    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        //按层遍历，将每一层最后一个加入结果集即可
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                TreeNode node = queue.remove();
                if (i == n - 1) {
                    result.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, 5, null, 4};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(rightSideView(root));
    }

}

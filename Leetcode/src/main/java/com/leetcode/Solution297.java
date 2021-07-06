package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : zhangwei
 * @description :二叉树的序列化与反序列化
 * @date: 2021-07-06 10:57
 */

public class Solution297 {


    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "null";
        }
        String left = serialize(root.left);
        String right = serialize(root.right);
        return root.val + "," + left + "," + right;
    }


    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        Queue<String> queue = new LinkedList(Arrays.asList(arr));
        return dfs(queue);
    }


    public static TreeNode dfs(Queue<String> queue) {
        String str = queue.poll();
        if ("null".equals(str)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str));
        root.left = dfs(queue);
        root.right = dfs(queue);
        return root;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        TreeOperation.show(tree);
        System.out.println(serialize(tree));
        TreeOperation.show(deserialize(serialize(tree)));
    }

}

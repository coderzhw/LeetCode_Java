package com.utils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {


    // 用数组建立普通二叉树,空节点可以传NULL
    public static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }


    //建立二叉树，注意和上面一种的区别
    public static TreeNode createBinaryTree(Integer[] array) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(array));
        return dfs(queue);
    }

    private static TreeNode dfs(Queue<Integer> queue) {
        Integer value = queue.poll();
        if (value == null) {
            return null;
        }
        TreeNode tn = new TreeNode(value);
        tn.left = dfs(queue);
        tn.right = dfs(queue);
        return tn;
    }


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
        return dfsDes(queue);
    }


    private static TreeNode dfsDes(Queue<String> queue) {
        String str = queue.poll();
        if ("null".equals(str)) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(str));
        root.left = dfsDes(queue);
        root.right = dfsDes(queue);
        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, null, null, 4, 5};
        TreeNode root = TreeUtils.createBinaryTree(arr);
        TreeOperation.show(root);
        //好好体会下这两种创建方式的区别，一种是以数组为基础创建完全二叉树，一种是以前序遍历为基础创建任意二叉树
        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        TreeNode root2 = TreeUtils.createBinaryTreeByArray(arr2, 0);
        TreeOperation.show(root2);
    }
}




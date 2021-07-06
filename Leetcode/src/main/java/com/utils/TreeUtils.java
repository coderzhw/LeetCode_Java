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

    public static TreeNode dfs(Queue<Integer> queue) {
        Integer value = queue.poll();
        if (value == null) {
            return null;
        }
        TreeNode tn = new TreeNode(value);
        tn.left = dfs(queue);
        tn.right = dfs(queue);
        return tn;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, null, null, 3, null, null};
        TreeNode root = TreeUtils.createBinaryTree(arr);
        TreeOperation.show(root);
    }
}




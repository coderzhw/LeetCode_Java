package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 路径总和
 */
public class Solution112 {


    public static boolean hasPathSum(TreeNode root, int targetSum) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        for (Integer tmp : list) {
            if (tmp == targetSum) {
                return true;
            }
        }
        return false;
    }
    public static void dfs(TreeNode root, List<Integer> list, int sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (root.left == null && root.right == null) {
            list.add(sum);
        } else {
            dfs(root.left, list,sum);
            dfs(root.right, list,sum);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println(hasPathSum(root, 22));
    }
}

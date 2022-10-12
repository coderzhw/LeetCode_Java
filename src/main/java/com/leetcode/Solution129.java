package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 求根节点到叶节点数字之和
 * @date: 2021-07-06 08:47
 */

public class Solution129 {

    public int sumNumbers(TreeNode root) {
        List<String> result = new ArrayList<>();
        String path = "";
        dfs(root, path, result);
        int sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum += Integer.valueOf(result.get(i));
        }
        return sum;
    }


    public void dfs(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }
        path += root.val;
        if (root.left == null && root.right == null) {
            result.add(path);
        }
        dfs(root.left, path, result);
        dfs(root.right, path, result);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println(new Solution129().sumNumbers(root));

    }
}

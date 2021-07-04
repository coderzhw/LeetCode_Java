package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉树的所有路径
 * @date: 2021-07-02 13:46
 */

public class Solution257 {

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        //存放每一次的路径
        String s = "";
        dfs(root, s, result);
        return result;
    }

    public static void dfs(TreeNode root, String s, List<String> result) {
        if (root == null) {
            return;
        }
        s += "" + root.val;
        if (root.left == null && root.right == null) {
            result.add(s);
        } else {
            s+="->";
            dfs(root.left,s,result);
            dfs(root.right,s,result);
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println(binaryTreePaths(root));
    }

}

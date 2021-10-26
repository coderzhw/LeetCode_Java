package com.swordoffer;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉树中和为某一值的路径
 * @date: 2021-10-26 14:20
 */

public class Offer34 {
    public List<List<Integer>> pathSum(TreeNode root, int target) {

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> path = new ArrayList<>();
        dfs(root, target, result, path);
        return result;
    }

    public void dfs(TreeNode root, int target, List<List<Integer>> result, List<Integer> path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                path.add(root.val);
                result.add(new ArrayList<>(path));
                path.remove(path.size() - 1);
            }
            return;
        }
        if (root.left != null) {
            path.add(root.val);
            dfs(root.left, target - root.val, result, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            path.add(root.val);
            dfs(root.right, target - root.val, result, path);
            path.remove(path.size() - 1);
        }

    }
}

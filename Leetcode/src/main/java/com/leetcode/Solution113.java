package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 路径总和 II
 */
public class Solution113 {

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, targetSum, res, new ArrayList<Integer>());
        return res;
    }

    private void dfs(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> cur) {
        if(null == root) return ;

        // 遍历左子树
        if (root.left != null) {
            // choose
            cur.add(root.val);
            // explore
            dfs(root.left, targetSum - root.val, res, cur);
            // un choose
            cur.remove(cur.size() - 1);
        }
        // 遍历右子树
        if (root.right != null) {
            cur.add(root.val);
            dfs(root.right, targetSum - root.val, res, cur);
            cur.remove(cur.size() - 1);
        }

        // 左右子树均为空，说明当前节点是一个叶子节点
        if (root.left == null && root.right == null) {
            // 满足条件。注意，将最后一个元素加入到集合中
            if (targetSum - root.val == 0) {
                cur.add(root.val);
                res.add(new ArrayList<>(cur));
                cur.remove(cur.size() - 1);
            }
            return;
        }
    }


    public static void main(String[] args) {
        Integer[] arr = {5, 4, 8, 11, 0, 13, 4, 7, 2, 0, 0, 0, 0, 5, 1};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println(new Solution113().pathSum(root, 22));
    }
}

package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 打家劫舍 III
 * @date: 2021-09-26 15:58
 */

public class Solution337 {


    Map<TreeNode, Integer> map = new HashMap<>();

    public int rob(TreeNode root) {

        if (root == null) return 0;
        if (root.left == null && root.right == null) return root.val;
        if (map.get(root) != null) return map.get(root);

        //选root节点,跳过直接的叶子节点取下一层节点
        int val1 = root.val;
        if (root.left != null) {
            val1 += rob(root.left.right) + rob(root.left.left);
        }
        if (root.right != null) {
            val1 += rob(root.right.left) + rob(root.right.right);
        }
        //不选root节点
        int val2 = rob(root.left) + rob(root.right);
        int max = Math.max(val1, val2);
        map.put(root, max);
        return map.get(root);
    }

    public static void main(String[] args) {
        Integer[] nums = {3, 2, 3, null, 3, null, 1};
        TreeNode root = TreeUtils.createBinaryTreeByArray(nums,0);
        TreeOperation.show(root);
        System.out.println(new Solution337().rob(root));
    }
}

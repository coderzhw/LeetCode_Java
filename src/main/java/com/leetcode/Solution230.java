package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉搜索树中第K小的元素
 * @date: 2021-07-07 15:11
 */

public class Solution230 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        return list.get(k-1);
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }
}

package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 验证二叉搜索树
 * @date: 2021-07-07 14:46
 */

public class Solution98 {

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
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

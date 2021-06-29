package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeUtils;

/**
 * 相同的树
 */
public class Solution100 {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            if (p == q) {
                return true;
            } else {
                return false;
            }
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Integer[] arr = {1,null,2};
        Integer[] arr1 = {1,null,2};
        TreeNode p = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeNode q = TreeUtils.createBinaryTreeByArray(arr1, 0);
        System.out.println(isSameTree(p,q));
    }
}

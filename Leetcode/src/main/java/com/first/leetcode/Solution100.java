package com.first.leetcode;

import com.common.utils.TreeNode;
import com.common.utils.TreeUtils;

/**
 * 相同的树
 */
public class Solution100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            int proot = p.val;
            int qroot = q.val;
            if (proot == qroot && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        TreeNode p = TreeUtils.createBinaryTreeByArray(new Integer[]{1,2},0);
        TreeNode q = TreeUtils.createBinaryTreeByArray( new Integer[]{1, null, 2},0);
        System.out.println(isSameTree(p, q));
    }


}

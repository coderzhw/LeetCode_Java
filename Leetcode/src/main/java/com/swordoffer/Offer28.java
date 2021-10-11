package com.swordoffer;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-10-11 17:10
 */

public class Offer28 {

    public boolean isSymmetric(TreeNode root) {
        return compareTreeNodes(root, root);
    }

    public static boolean compareTreeNodes(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) && compareTreeNodes(t1.left, t2.right) && compareTreeNodes(t1.right, t2.left);
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, null, 3, null, 3};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);

        System.out.println(new Offer28().isSymmetric(root));
    }
}

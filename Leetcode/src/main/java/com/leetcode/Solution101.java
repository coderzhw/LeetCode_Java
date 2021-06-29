package com.leetcode;


import com.utils.TreeNode;
import com.utils.TreeUtils;

/**
 * 对称二叉树
 */
public class Solution101 {

    public static boolean isSymmetric(TreeNode root) {
       if(root==null){
           return true;
       }
       return isSymmetric(root.left,root.right);
    }

    public static boolean isSymmetric(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null ||q==null){
            return false;
        }
        return p.val==q.val && isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 2, 2, 3, 4, 4, 3};
        TreeNode p = TreeUtils.createBinaryTreeByArray(arr, 0);
        System.out.println(isSymmetric(p));
    }


}

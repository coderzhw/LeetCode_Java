package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树展开为链表
 */
public class Solution114 {
    //先用先序遍历递归能过系统
    public static void flatten2(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        preOrderTrans(list,root);
        for (int i = 0; i < list.size()-1; i++) {
            TreeNode tmp=list.get(i);
            tmp.left=null;
            tmp.right=list.get(i+1);
        }
    }
    public static void preOrderTrans(List<TreeNode> list,TreeNode root){
        if(root==null){
            return;
        }
        list.add(root);
        preOrderTrans(list,root.left);
        preOrderTrans(list,root.right);
    }


    //一种类似于mirrors的解法
    public static void flatten(TreeNode root) {
        while (root!=null){
            if(root.left==null){
               root=root.right;
            }else {
                //先找到前一个结点,左子树最右边的节点
                TreeNode pre=root.left;
                while (pre.right!=null){
                     pre=pre.right;
                }
                pre.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }
    }



}

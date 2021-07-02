package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

/**
 * @author : zhangwei
 * @description : 完全二叉树的节点个数
 * @date: 2021-07-02 10:28
 */

public class Solution222 {


    public static int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftDepth=countLevel(root.left);
        int rightDepth=countLevel(root.right);

       // System.out.println("根节点:"+root.val+"leftDepth:"+leftDepth+"righrDepth"+rightDepth);

        //说明左边是满的
        if(leftDepth==rightDepth){
            //这里特别注意位移操作符的优先级，必须得打括号
            return (1<<leftDepth)+countNodes(root.right);
        }else {
            return (1<<rightDepth)+countNodes(root.left);
        }

    }

    //计算一个完全二叉树的高度
    public static int countLevel(TreeNode root) {
        int depth = 0;
        while (root != null) {
            depth++;
            //这里为什么是左指针，因为完全二叉树左边满了才会填充右边
            root = root.left;
        }
        return depth;
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println(countNodes(root));

    }

}

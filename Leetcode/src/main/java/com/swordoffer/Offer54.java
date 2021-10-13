package com.swordoffer;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉搜索树的第k大节点
 * @date: 2021-10-13 10:46
 */

public class Offer54 {
    public int kthLargest(TreeNode root, int k) {
        List<Integer> list=new ArrayList();
        traverse(root,list);
        return list.get(k-1);
    }

    public void traverse(TreeNode root,List<Integer> list){
        if(root==null) return;
        traverse(root.right,list);
        list.add(root.val);
        traverse(root.left,list);
    }
}

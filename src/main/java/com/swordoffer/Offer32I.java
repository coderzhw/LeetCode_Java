package com.swordoffer;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : zhangwei
 * @description : 从上到下打印二叉树
 * @date: 2021-10-26 10:39
 */

public class Offer32I {
    public int[] levelOrder(TreeNode root) {
        if(root==null) return new int[0];
        Queue<TreeNode> queue=new LinkedList<>();
        List<Integer> list=new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int k=queue.size();
            for(int i=0;i<k;i++){
                TreeNode node=queue.poll();
                list.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }

        return result;
    }
}

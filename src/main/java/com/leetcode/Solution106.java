package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 从中序与后序遍历序列构造二叉树
 * @date: 2021-07-09 09:06
 */

public class Solution106 {


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return dfs(inorder, 0, inorder.length, postorder, 0, postorder.length, map);
    }

    private TreeNode dfs(int[] inorder, int istart, int iend, int[] postorder, int pstart, int pend, Map<Integer, Integer> map) {
        if (istart == iend) {
            return null;
        }
        if (pstart == pend) {
            return null;
        }
        int rootValue=postorder[pend-1];
        int index=map.get(rootValue);
        int leftNum=index-istart;
        TreeNode treeNode=new TreeNode(rootValue);
        //要注意这里的下标变化，对于中序遍历这个数组来说和105题没啥区别，但是对前序或者后序遍历，这个数组下标到底咋回事只能画图看出来
        treeNode.left=dfs(inorder, istart, index, postorder, pstart, pstart+leftNum, map);
        treeNode.right=dfs(inorder, index+1, iend, postorder, pstart+leftNum, pend-1, map);
        return treeNode;
    }
    public static void main(String[] args) {
        int post[]={9,15,7,20,3};
        int inorder[]={9,3,15,20,7};
        TreeOperation.show(new Solution106().buildTree(inorder,post));
    }

}

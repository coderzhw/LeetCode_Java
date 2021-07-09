package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;

import javax.xml.bind.helpers.AbstractUnmarshallerImpl;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 从前序与中序遍历序列构造二叉树
 * @date: 2021-07-08 11:04
 */

public class Solution105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return dfs(preorder, 0, preorder.length, inorder, 0, inorder.length, map);
    }

    //递归创建二叉树,左闭右开区间
    private TreeNode dfs(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend, Map<Integer, Integer> map) {
        if (pstart == pend) {
            return null;
        }
        if (istart == iend) {
            return null;
        }
        //前序遍历第一个元素就是根节点
        int index = map.get(preorder[pstart]);
        //将中序遍历分成两份,分别代表左右子树
        int leftNum = index - istart;
        TreeNode tn = new TreeNode(preorder[pstart]);
        tn.left = dfs(preorder, pstart + 1, pstart + leftNum + 1, inorder, istart, index, map);
        tn.right = dfs(preorder, pstart+leftNum+1, pend, inorder, index+1, iend, map);
        return tn;
    }

    public static void main(String[] args) {
        int pre[]={3,9,20,15,7};
        int inorder[]={9,3,15,20,7};
        TreeOperation.show(new Solution105().buildTree(pre,inorder));
    }
}

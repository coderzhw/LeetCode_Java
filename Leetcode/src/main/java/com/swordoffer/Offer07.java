package com.swordoffer;

import com.utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 重建二叉树
 * @date: 2021-11-08 14:32
 */

public class Offer07 {


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return dfs(preorder, 0, preorder.length, inorder, 0, inorder.length, inorderMap);
    }

    /**
     * 左开右闭区间
     **/
    public TreeNode dfs(int[] preorder, int pstart, int pend, int[] inorder, int istart, int iend, Map<Integer, Integer> inorderMap) {
        if (pstart == pend) return null;
        if (istart == iend) return null;
        int root = preorder[pstart];
        int rootIndex = inorderMap.get(root);
        int leftNum = rootIndex - istart;
        TreeNode tn = new TreeNode(root);
        tn.left = dfs(preorder, pstart + 1, pstart + 1 + leftNum, inorder, istart, rootIndex, inorderMap);
        tn.right = dfs(preorder, pstart + 1 + leftNum, pend, inorder, rootIndex+1, iend, inorderMap);
        return tn;
    }


}

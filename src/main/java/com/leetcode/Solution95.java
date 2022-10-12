package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 不同的二叉搜索树 II
 * @date: 2021-07-07 10:12
 */

public class Solution95 {

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<>();
        }
        return generateBST(1, n);
    }

    //生成值为start到end之间的二叉搜索树
    public List<TreeNode> generateBST(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
        }
        //第一层是根节点的值
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = generateBST(start, i - 1);
            List<TreeNode> right = generateBST(i + 1, end);

            //双层for循环构造满足要求的二叉搜索树
            for (TreeNode lf : left) {
                for (TreeNode rg : right) {
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left = lf;
                    treeNode.right = rg;
                    result.add(treeNode);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<TreeNode> list = new Solution95().generateTrees(3);
        for (TreeNode tr : list) {
            TreeOperation.show(tr);
        }
    }

}

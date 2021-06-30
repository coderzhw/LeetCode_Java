package com.leetcode;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 恢复二叉搜索树
 * @date: 2021-06-30 08:57
 */

public class Solution99 {


    public static void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        inOrderTrval(root, list);
        TreeNode x = null;
        TreeNode y = null;
        for (int i = 0; i < list.size() - 1; i++) {
            //遍历list，找到前面的数大于后面一个数的节点并交换，
            // 这里要画一下图走一遍,因为里面明确说了只有两个节点错位了，所以只需交换那两个节点即可
            if (list.get(i).val > list.get(i + 1).val) {
                y = list.get(i + 1);
                if (x == null) {
                    x = list.get(i);
                }
            }
        }
        //上面是找到两个节点，下面交换两个节点的值（为啥是换节点的值不是直接交换节点呢？可能是左右子节点的对应关系不好交换吧）
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }


    //中序遍历
    static void inOrderTrval(TreeNode root, List<TreeNode> list) {
        if (root == null) {
            return;
        }
        inOrderTrval(root.left, list);
        list.add(root);
        inOrderTrval(root.right, list);
    }

    public static void main(String[] args) {
        Integer[] arr = {1, 3, null, null, 2};
        TreeNode root = TreeUtils.createBinaryTreeByArray(arr, 0);
        TreeOperation.show(root);
        System.out.println("\n");
        recoverTree(root);
        TreeOperation.show(root);
    }

}

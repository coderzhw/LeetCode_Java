package com.leetcode;

import com.utils.TreeNode;

/**
 * @author : zhangwei
 * @description : 将有序数组转换为二叉搜索树
 * @date: 2021-07-07 15:27
 */

public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }

    private TreeNode bst(int nums[], int low, int high) {
        if (low > high) {
            return null;
        }
        int middle = low + (high - low) / 2;
        TreeNode tn = new TreeNode(nums[middle]);
        TreeNode left = bst(nums, low, middle - 1);
        TreeNode right = bst(nums, middle + 1, high);
        tn.left = left;
        tn.right = right;
        return tn;
    }


}

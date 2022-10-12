package com.leetcode;

import com.utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 二叉搜索树迭代器
 * @date: 2021-06-30 08:33
 */

public class Solution173 {


    class BSTIterator {

        private Integer index;
        private List<Integer> list;

        public BSTIterator(TreeNode root) {
            index = 0;
            list = new ArrayList<>();
            inorderTrans(root, list);

        }
        public int next() {
            return list.get(index++);
        }

        public boolean hasNext() {
            return index < list.size();
        }
        void inorderTrans(TreeNode root, List<Integer> list) {
            if(root==null){
                return;
            }
            inorderTrans(root.left, list);
            list.add(root.val);
            inorderTrans(root.right, list);
        }
    }


}

package com.swordoffer;

import com.utils.TreeNode;
import com.utils.TreeOperation;
import com.utils.TreeUtils;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 序列化二叉树
 * @date: 2021-11-10 16:18
 */

public class Offer37 {

    public static class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            List<String> list = new ArrayList<>();
            dfs(root, list);
            return String.join(",", list.toArray(new String[]{}));
        }

        public void dfs(TreeNode root, List<String> list) {
            if (root == null) {
                list.add("null");
                return;
            }
            list.add(root.val + "");
            dfs(root.left, list);
            dfs(root.right, list);
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] arr = data.split(",");
            Queue<String> queue = new LinkedList(Arrays.asList(arr));
            return dfsDes(queue);
        }

        private static TreeNode dfsDes(Queue<String> queue) {
            String str = queue.poll();
            if ("null".equals(str)) {
                return null;
            }
            TreeNode root = new TreeNode(Integer.valueOf(str));
            root.left = dfsDes(queue);
            root.right = dfsDes(queue);
            return root;
        }
    }


    public static void main(String[] args) {
        Codec codec = new Codec();
        Integer[] arr = {1, 2, 3, null, null, 4, 5};
        TreeNode root = TreeUtils.createBinaryTree(arr);
        // System.out.println(codec.serialize(root));
        TreeNode result = codec.deserialize(codec.serialize(root));
        TreeOperation.show(result);

    }


}

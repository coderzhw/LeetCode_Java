package com.leetcode;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 区域和检索 - 数组可修改
 * @date: 2021-07-12 14:19
 */

public class Solution307 {

    static class NumArray {

        private int[] tree;
        private int[] nums;
        private int len;

        public NumArray(int[] nums) {
            this.len = nums.length;
            this.nums = nums;
            this.tree = new int[len * 4];
            buildTree(0, 0, len - 1);
        }

        public void buildTree(int node, int start, int end) {
            if (end < start) {
                return;
            }
            if (start == end) {
                tree[node] = nums[start];
            } else {
                int mid = (start + end) / 2;
                int leftNode = 2 * node + 1;
                int rightNode = 2 * node + 2;
                buildTree(leftNode, start, mid);
                buildTree(rightNode, mid + 1, end);
                tree[node] = tree[leftNode] + tree[rightNode];
            }
        }


        public void update(int index, int val) {
            updateTree(0, 0, len - 1, index, val);
        }


        public void updateTree(int node, int start, int end, int index, int val) {
            if (end < start) {
                return;
            }
            if (start == end) {
                nums[index] = val;
                tree[node] = val;
            } else {
                int mid = (start + end) / 2;
                int leftNode = 2 * node + 1;
                int rightNode = 2 * node + 2;
                if (mid >= index) {
                    updateTree(leftNode, start, mid, index, val);
                } else {
                    updateTree(rightNode, mid + 1, end, index, val);
                }
                tree[node] = tree[leftNode] + tree[rightNode];
            }
        }

        public int sumRange(int left, int right) {
            return query(0, 0, len - 1, left, right);
        }

        public int query(int node, int start, int end, int L, int R) {
            if (L > end || R < start) {
                return 0;
            }
            //这里后面的判断条件是为了防止每个分支都递归到根节点，在前面打印一下start，end就可以知道了
            if (start == end || (L <= start && R >= end)) {
                return tree[node];
            } else {
                int mid = (start + end) / 2;
                int leftNode = 2 * node + 1;
                int rightNode = 2 * node + 2;
                return query(leftNode, start, mid, L, R) + query(rightNode, mid + 1, end, L, R);
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        NumArray numArray = new NumArray(arr);
        System.out.println(Arrays.toString(numArray.tree));
        numArray.update(3, 15);
        System.out.println(Arrays.toString(numArray.tree));
        System.out.println(numArray.sumRange(1, 4));
    }
}

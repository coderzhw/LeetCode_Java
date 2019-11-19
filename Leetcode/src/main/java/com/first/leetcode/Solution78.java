package com.first.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 子集
 * Created by zhangwei03 on 2019/11/19.
 * 从前往后遍历, 遇到一个数, 之前的所有集合添加上这个数组成新的子集
 */
public class Solution78 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //初始化
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2};
        List<List<Integer>> res = subsets(nums);
        System.out.println(res);
    }
}

package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 杨辉三角
 * @date: 2021-08-31 16:58
 */

public class Solution118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        for (int i = 2; i <= numRows; i++) {
            Integer[] ans = new Integer[i];
            ans[0] = ans[i-1] = 1;
            for (int j = 1; j < i-1; j++) {
                ans[j] = result.get(i - 2).get(j) + result.get(i - 2).get(j - 1);

            }
            result.add(Arrays.asList(ans));
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(new Solution118().generate(5));
    }


}

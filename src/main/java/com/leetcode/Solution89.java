package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 格雷编码
 * @date: 2021-09-01 20:23
 */

public class Solution89 {

    public List<Integer> grayCode(int n) {
        int size = 1 << n;
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution89().grayCode(2));
    }

}

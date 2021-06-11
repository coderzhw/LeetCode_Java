package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 排列序列
 * @date: 2021-06-10 11:01
 */

public class Solution60 {

    //利用康托展开求解
    public static String getPermutation(int n, int k) {
        //这里减一是由康托展开的定义决定的
        k--;
        StringBuilder result = new StringBuilder();
        //先将1,2,3....n放入一个数组中
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            arrayList.add(i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorial(i);
            result.append(arrayList.remove(index));
            k = k % factorial(i);
        }
        return result.toString();
    }

    /**
     * 求某个数的阶乘
     *
     * @param n
     * @return
     */
    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(getPermutation(3,1));
    }


}

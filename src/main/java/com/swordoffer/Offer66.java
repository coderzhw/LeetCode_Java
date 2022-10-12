package com.swordoffer;

import java.util.Arrays;

/**
 * @author : zhangwei
 * @description : 构建乘积数组
 * @date: 2021-11-04 10:09
 */

public class Offer66 {

    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) return a;
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * a[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {
            right[i] = right[i + 1] * a[i + 1];
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(new Offer66().constructArr(a)));
    }


}

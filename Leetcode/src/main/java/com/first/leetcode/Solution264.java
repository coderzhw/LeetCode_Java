package com.first.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 丑数II
 */
public class Solution264 {

    public static int nthUglyNumber(int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        List<Integer> result = new ArrayList<>();
        result.add(1);
        int index2 = 0, index3 = 0, index5 = 0;//用来标记2、3、5类别中，选到哪一个数
        int count = 1;//用来记录丑数的个数
        while (count < n) {
            int next = min(result.get(index2) * 2, result.get(index3) * 3, result.get(index5) * 5);
            result.add(next);
            while (result.get(index2) * 2 <= next) {
                index2++;
            }
            while (result.get(index3) * 3 <= next) {
                index3++;
            }
            while (result.get(index5) * 5 <= next) {
                index5++;
            }
            count++;
        }
        return result.get(n - 1);
    }

    public static int min(int a, int b, int c) {
        int temp = (a < b) ? a : b;
        return (temp < c) ? temp : c;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

}

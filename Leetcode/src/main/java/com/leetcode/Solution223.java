package com.leetcode;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-09-02 20:12
 */

public class Solution223 {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int sum = (C - A) * (D - B) + (G - E) * (H - F);
        //如果两个矩形
        if (G <= A || C <= E || B >= H || F >= D) {
            return sum;
        }
        int up = Math.min(C, G);
        int down = Math.max(A, E);
        int left = Math.max(B, F);
        int right = Math.min(D, H);
        return sum - (up - down) * (right - left);
    }
}

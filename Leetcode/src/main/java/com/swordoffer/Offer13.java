package com.swordoffer;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-11-01 16:44
 */

public class Offer13 {


    public int movingCount(int m, int n, int k) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!check(i, j, k, m,n)) continue;
                count++;
            }
        }
        return count;
    }


    public boolean check(int i, int j, int k, int m,int n) {
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return false;
        }
        int ij = Integer.valueOf(i + "" + j);
        int count = 0;
        while (ij != 0) {
            count += ij % 10;
            ij = ij / 10;
        }
        if (count > k) return false;
        System.out.println(i+"========"+j+"======"+count+"==========");
        return true;
    }

    public static void main(String[] args) {
        int m =16, n = 8, k = 4;
        System.out.println(new Offer13().movingCount(m, n, k));
    }


}

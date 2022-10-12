package com.swordoffer;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-11-01 16:44
 */

public class Offer13 {


    //关键性分析，往右或者下能走完所有可能的格子,不分析把四种情况都遍历一遍也能做出来
    public int movingCount(int m, int n, int k) {
        boolean[][] used = new boolean[m][n];
        return dfs(0, 0, m, n, k, used);
    }

    public int dfs(int i, int j, int m, int n, int k, boolean[][] used) {
        //System.out.println("======i:"+i+"=========j:"+j);
        if (i < 0 || j < 0 || i >= m || j >= n || used[i][j] || sum(i, j) > k) return 0;
        used[i][j] = true;
        return 1 + dfs(i + 1, j, m, n, k, used) +
                dfs(i, j + 1, m, n, k, used) +
                dfs(i - 1, j, m, n, k, used) +
                dfs(i, j - 1, m, n, k, used);
    }

    public int sum(int i, int j) {
        int result = 0;
        int ij = Integer.valueOf(i + "" + j);
        while (ij != 0) {
            result += ij % 10;
            ij = ij / 10;
        }
        return result;
    }


    public static void main(String[] args) {
        int m = 16, n = 8, k = 4;
        System.out.println(new Offer13().movingCount(m, n, k));
    }


}

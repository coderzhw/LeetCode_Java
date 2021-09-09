package com.leetcode;

/**
 * @author : zhangwei
 * @description : 买卖股票的最佳时机 II
 * @date: 2021-09-09 16:58
 */

public class Solution122 {

    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            result += Math.max(prices[i + 1] - prices[i], 0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(new Solution122().maxProfit(prices));
    }


}

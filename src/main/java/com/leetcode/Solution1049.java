package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最后一块石头的重量 II
 * @date: 2021-09-17 17:08
 */

public class Solution1049 {

    public int lastStoneWeightII(int[] stones) {
        //石头不满足2个时直接返回
        if (stones.length == 1) {
            return stones[0];
        }
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        //把石头分成尽量相等的两堆，此时可得最小值
        int target = sum / 2;
        int[] dp = new int[target + 1];

        for (int i = 0; i < stones.length; i++) {
            for (int j = target; j >= stones[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return (sum - dp[target]) - dp[target];
    }

    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(new Solution1049().lastStoneWeightII(stones));
    }


}

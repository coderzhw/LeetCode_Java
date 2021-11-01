package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 把数字翻译成字符串
 * @date: 2021-10-29 16:45
 */

public class Offer46 {


    public int translateNum(int num) {
        String str = String.valueOf(num);
        int[] dp = new int[str.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= str.length(); i++) {
            String s = str.substring(i - 2, i);
            if (s.compareTo("10") >= 0 && s.compareTo("25") <= 0) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[str.length()];
    }
}

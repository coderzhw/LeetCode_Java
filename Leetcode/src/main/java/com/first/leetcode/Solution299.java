package com.first.leetcode;

/**
 * 猜数字游戏
 * Created by zhangwei03 on 2019/8/7.
 */
public class Solution299 {

    public static String getHint(String secret, String guess) {
        int m[] = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); ++i) {
            if (secret.charAt(i) == guess.charAt(i)) {
                ++bulls;
            } else {
                if (m[secret.charAt(i) - '0']++ < 0) {
                    ++cows;
                }
                if (m[guess.charAt(i) - '0']-- > 0) {
                    ++cows;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810"));
    }


}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 单词拆分
 * @date: 2021-09-24 09:56
 */

public class Solution139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String tmp = s.substring(j, i);
                if (wordDict.contains(tmp) && dp[j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[s.length()];
    }


    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(new Solution139().wordBreak(s, wordDict));
    }


}

package com.leetcode;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 无重复字符的最长子串
 * @date: 2021-06-18 15:54
 */

public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int left = 0;
        int result = Integer.MIN_VALUE;
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            map.put(s.charAt(right), right);
            result = Math.max(result, right - left + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }


}

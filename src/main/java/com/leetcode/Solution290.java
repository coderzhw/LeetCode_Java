package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 单词规律
 * @date: 2021-07-15 16:20
 */

public class Solution290 {

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> pMap = new HashMap<>();
        Map<String, Character> sMap = new HashMap<>();
        String[] sArr = s.split(" ");
        if (pattern.length() != sArr.length) {
            return false;
        }
        for (int i = 0; i < pattern.length(); i++) {
            Character p = pattern.charAt(i);
            String str = sArr[i];
            if (!pMap.containsKey(p)) {
                pMap.put(p, str);
            } else if (!pMap.get(p).equals(str)) {
                return false;
            }
            if (!sMap.containsKey(str)) {
                sMap.put(str, p);
            } else if (!sMap.get(str).equals(p)) {
                return false;
            }
        }
        return true;
    }

}

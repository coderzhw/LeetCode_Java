package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 同构字符串
 * @date: 2021-07-15 16:36
 */

public class Solution205 {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> pMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character sc = s.charAt(i);
            Character tc = t.charAt(i);
            if (!sMap.containsKey(sc)) {
                sMap.put(sc, tc);
            } else if (sMap.get(sc) != tc) {
                return false;
            }
            if (!pMap.containsKey(tc)) {
                pMap.put(tc, sc);
            } else if (pMap.get(tc) != sc) {
                return false;
            }
        }
        return true;
    }


}

package com.leetcode;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 字母异位词分组
 * @date: 2021-07-12 18:16
 */

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char charArray[] = strs[i].toCharArray();
            Arrays.sort(charArray);
            List<String> list = map.getOrDefault(String.valueOf(charArray), new ArrayList<>());
            list.add(strs[i]);
            map.put(String.valueOf(charArray), list);
        }

        result.addAll(map.values());
        return result;
    }


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new Solution49().groupAnagrams(arr));
    }

}

package com.first.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 单词规律
 */
public class Solution290 {

    public static boolean wordPattern(String pattern, String str) {
        int partStart = 0;
        int strStart = 0;
        Map<Character, Integer> parList = new HashMap<>();
        Map<String, Integer> strList = new HashMap<>();
        char[] chars = pattern.toCharArray();
        String[] strings = str.split(" ");

        if (chars.length!=strings.length){
            return false;
        }

        for (char aChar : chars) {
            if (!parList.containsKey(aChar)) {
                parList.put(aChar, ++partStart);
            }
        }
        for (String string : strings) {
            if (!strList.containsKey(string)) {
                strList.put(string, ++strStart);
            }
        }

        for (int i = 0, j = 0; j < strings.length; i++, j++) {
            if (!parList.get(chars[i]).equals(strList.get(strings[j]))) {
                return false;
            }
        }

        return true;
    }

    public static boolean wordPattern2(String pattern, String str) {
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) return false;
        int len = pattern.length();
        for (int i = 0; i < len; i++) {
            if(pattern.indexOf(pattern.charAt(i)) != indexOf(arr, arr[i])){
                return false;
            }
        }
        return true;
    };

    public static int indexOf(String[] arrays, String searchString) {
        int ans = -1;
        for(int i = 0; i < arrays.length; i++) {
            if (arrays[i].equals(searchString)) {
                ans = i;
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern2("abba","dog cat cat dog"));

    }
}

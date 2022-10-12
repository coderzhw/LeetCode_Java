package com.leetcode;

/**
 * @author : zhangwei
 * @description : 有效的字母异位词
 * @date: 2021-07-12 18:04
 */

public class Solution242 {

    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s, t;
        s = "anagram";
        t = "nagaram";
        System.out.println(new Solution242().isAnagram(s, t));
    }

}

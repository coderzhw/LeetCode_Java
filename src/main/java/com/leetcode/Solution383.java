package com.leetcode;

/**
 * @author : zhangwei
 * @description : 赎金信
 * @date: 2021-07-12 18:10
 */

public class Solution383 {

    public boolean canConstruct(String ransomNote, String magazine) {

        int [] arr=new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            arr[ransomNote.charAt(i) - 'a']--;
        }
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return false;
            }
        }
        return true;

    }
}

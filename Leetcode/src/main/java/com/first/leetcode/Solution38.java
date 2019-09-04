package com.first.leetcode;

/**
 * Created by zhangwei03 on 2019/7/25.
 */
public class Solution38 {

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.isEmpty() && magazine.isEmpty() || ransomNote.isEmpty()) {
            return true;
        }else if( magazine.isEmpty()){
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            arr[c - 'a']++;
        }
        boolean flag = true;
        for (int j = 0; j < ransomNote.length(); j++) {
            char x = ransomNote.charAt(j);
            if (arr[x - 'a'] == 0) {
                flag = false;
                break;
            }else {
                arr[x-'a']--;
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b"));
    }


}

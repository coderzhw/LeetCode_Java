package com.leetcode;

/**
 * 最长公共前缀
 */
public class Solution14 {

    public String longestCommonPrefix(String[] strs) {
        String str = strs[0];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            Character s = str.charAt(i);
            boolean flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()||(i < strs[j].length() && strs[j].charAt(i) != s)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                result.append(s);
            }else {
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String strs[] = {"cir", "car"};
        System.out.println(new Solution14().longestCommonPrefix(strs));
    }

}

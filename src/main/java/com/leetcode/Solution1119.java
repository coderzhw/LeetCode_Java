package com.leetcode;

public class Solution1119 {

    public String removeVowels(String s) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiou";
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (!vowels.contains(charArr[i] + "")) {
                result.append(charArr[i] + "");
            }
        }
        return result.toString();
    }
}

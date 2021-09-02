package com.leetcode;

/**
 * @author : zhangwei
 * @description : 最大单词长度乘积
 * @date: 2021-09-02 19:31
 */

public class Solution318 {

    public int maxProduct(String[] words) {
        int result = 0;
        int[] hash=new int[words.length];
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                hash[i]|=1<<(words[i].charAt(j)-'a');
            }
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((hash[i]&hash[j])==0) {
                    result = Math.max(result, words[i].length() * words[j].length());
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(new Solution318().maxProduct(words));
    }


}

package com.test.leetcode;

/**
 * 宝石与石头
 */
public class Solution771 {
    public static int numJewelsInStones(String J, String S) {
        int count=0;
         for(int i=0;i<S.length();i++){
             char s=S.charAt(i);
             if(J.contains(Character.toString(s))){
                 count++;
             }
         }
         return count;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}

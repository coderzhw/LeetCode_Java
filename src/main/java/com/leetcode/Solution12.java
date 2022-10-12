package com.leetcode;

/**
 * @author : zhangwei
 * @description : 整数转罗马数字
 * @date: 2021-07-19 10:30
 */

public class Solution12 {

    public String intToRoman(int num) {
        int[] integerArr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanArr = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder result = new StringBuilder();
        for (int i = 0; num > 0; i++) {
            int count = num / integerArr[i];
            num = num % integerArr[i];
            while (count > 0) {
                result.append(romanArr[i]);
                count--;
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution12().intToRoman(3));
        System.out.println(new Solution12().intToRoman(4));
        System.out.println(new Solution12().intToRoman(9));
        System.out.println(new Solution12().intToRoman(58));
        System.out.println(new Solution12().intToRoman(1994));
    }


}

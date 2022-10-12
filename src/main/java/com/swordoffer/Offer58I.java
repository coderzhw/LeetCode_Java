package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 翻转单词顺序
 * @date: 2021-10-13 15:10
 */

public class Offer58I {
    public String reverseWords(String s) {
        s=s.trim();
        if(s.length()==0) return s;
        String reverseS = reverseWord(s);
        String[] arrList = reverseS.split(" ");
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < arrList.length; i++) {
            if(!"".equals(arrList[i])) {
                result.append(reverseWord(arrList[i])).append(" ");
            }
        }
        return result.toString().substring(0,result.length()-1);
    }

    public String reverseWord(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s="a good   example";
        System.out.println(new Offer58I().reverseWords(s));
    }
}

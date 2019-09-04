package com.first.leetcode;


/**
 * 实现strStr()
 * Created by zhangwei03 on 2019/7/24.
 */
public class Solution28 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            int cur = i;
            for (int j = 0; j < needle.length(); j++) {

                // haystack 中剩余字符已不够，无需再比较
                if (i + needle.length() > haystack.length()) {
                    return -1;
                }

                if (haystack.charAt(cur) != needle.charAt(j)) {
                    break;
                }

                // 完全匹配，返回i
                if (j == needle.length() - 1) {
                    return i;
                }

                cur++;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issipi"));
    }
}

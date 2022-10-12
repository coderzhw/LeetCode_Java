package com.leetcode;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-07-20 16:07
 */

public class Solution38 {

    public String countAndSay(int n) {
        StringBuilder pre = new StringBuilder();
        StringBuilder cur = new StringBuilder("1");
        for (int i = 0; i < n - 1; i++) {
            pre = cur;
            cur = new StringBuilder();
            int start, end;
            start = end = 0;
            //循环遍历前一个字符串拼接到当前字符串上面
            while (end<pre.length()){
                while (end<pre.length() && pre.charAt(start)==pre.charAt(end)){
                    end++;
                }
                cur.append((end-start)).append(pre.charAt(start));
                start=end;
            }
        }
        return cur.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Solution38().countAndSay(3));
    }
}

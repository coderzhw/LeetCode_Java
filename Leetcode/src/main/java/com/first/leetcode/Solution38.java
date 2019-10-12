package com.first.leetcode;

/**
 * 报数
 * Created by zhangwei03 on 2019/10/12.
 */
public class Solution38 {

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        //递归实现,*号是为了循环判断到最后时数组不越界，比较巧妙
        String str = countAndSay(n - 1) + "*";
        char[] c = str.toCharArray();
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < c.length - 1; i++) {
            if (c[i] == c[i + 1]) {
                count++;
            } else {
                result.append("" + count + c[i]);
                count=1;
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println(countAndSay(i));
        }

    }
}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description :Z 字形变换
 * @date: 2021-09-01 11:13
 */

public class Solution6 {

    public String convert(String s, int numRows) {
        if (numRows < 2) return s;
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char ch : s.toCharArray()) {
            StringBuilder tmp = list.get(i);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            tmp.append(ch);
            i = i + flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }
        return res.toString();
    }


    public static void main(String[] args) {
        int numRows = 3;
        String s = "PAYPALISHIRING";

        System.out.println(new Solution6().convert(s, numRows));

    }

}

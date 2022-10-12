package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 分数到小数
 * @date: 2021-08-26 09:17
 */

public class Solution166 {

    public String fractionToDecimal(int numerator, int denominator) {
        long a = numerator, b = denominator;
        StringBuilder result = new StringBuilder();
        Map<Long, Integer> map = new HashMap<>();
        if (a * b < 0) {
            result.append("-");
        }
        a = Math.abs(a);
        b = Math.abs(b);
        //如果能被整除就直接返回
        result.append(a / b);
        if (a % b == 0) return result.toString();
        //后面处理小数部分
        result.append(".");
        //如果是循环小数
        while (a > 0) {
            a = (a % b) * 10;
            if (a != 0 && !map.containsKey(a)) {
                map.put(a, result.length());
                result.append(a / b);
            } else {
                break;
            }
        }
        if (a == 0) return result.toString();
        return result.insert(map.get(a).intValue(), "(").append(")").toString();
    }


    public static void main(String[] args) {
        int numerator = 2, denominator = 3;
        System.out.println(new Solution166().fractionToDecimal(numerator, denominator));
    }


}

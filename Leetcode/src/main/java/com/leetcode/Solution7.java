package com.leetcode;

/**
 * @author : zhangwei
 * @description :整数反转
 * @date: 2021-08-30 10:51
 */

public class Solution7 {

    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(Long.valueOf(x+"")));
        Long tmp = Long.valueOf(sb.reverse().toString());
        if (x < 0) {
            tmp = -tmp;
        }
        if (tmp < Integer.MIN_VALUE || tmp > Integer.MAX_VALUE) {
            return 0;
        }
        return tmp.intValue();
    }

    public static void main(String[] args) {
        System.out.println(new Solution7().reverse(-2147483648));
    }
}

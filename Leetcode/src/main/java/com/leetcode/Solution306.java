package com.leetcode;

/**
 * @author : zhangwei
 * @description : 累加数
 * @date: 2021-08-27 11:11
 */

public class Solution306 {

    public boolean isAdditiveNumber(String num) {
        return dfs(num, 0, "0", "0", 0);
    }

    /**
     * @param num   字符串本身
     * @param index 当前遍历到的下标
     * @param sum   前面两个数的和
     * @param pre   前面一个数
     * @param k     num被分成的段数
     * @return
     */
    public boolean dfs(String num, int index, String sum, String pre, int k) {
        if (index == num.length()) {
            return k > 2;
        }
        for (int i = index; i < num.length(); i++) {
            String cur = getCurrentNum(num, index, i);
            if (cur.equals("-1")) {
                continue;
            }
            if (k >= 2 && !cur.equals(sum)) {
                continue;
            }
            if (dfs(num, i + 1, addStrings(pre, cur), cur, k + 1)) {
                return true;
            }
        }
        return false;
    }


    public String addStrings(String num1, String num2) {
        StringBuilder builder = new StringBuilder();
        int sum = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || sum != 0) {
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            builder.append(sum % 10);
            sum /= 10;
        }
        return builder.reverse().toString();
    }


    public String getCurrentNum(String num, int begin, int end) {
        //数字长度大于1，且以0开头就是非法的
        if (begin < end && num.charAt(begin) == '0') {
            return "-1";
        }
        String tmp = num.substring(begin, end + 1);
        return tmp;
    }

    public static void main(String[] args) {
        System.out.println(new Solution306().isAdditiveNumber("1234567891234567891234567890123456789123456789123456789"));
    }

}

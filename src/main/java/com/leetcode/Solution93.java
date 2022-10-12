package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 复原 IP 地址
 * @date: 2021-08-27 09:55
 */

public class Solution93 {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        if(s.length()>12){
            return result;
        }
        dfs(s, 0, 0, result);
        return result;

    }

    public void dfs(String s, int start, int pointNum, List<String> result) {
        if (pointNum == 3) {
            if (check(s, start, s.length() - 1)) {
                result.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (check(s, start, i)) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                pointNum++;
                dfs(s, i + 2, pointNum, result);
                pointNum--;
                s = s.substring(0, i + 1) + s.substring(i + 2);
            }
        }
    }

    public boolean check(String s, int begin, int end) {
        if (begin > end) {
            return false;
        }
        String numStr = s.substring(begin, end + 1);
        int num = Long.valueOf(numStr).intValue();
        if (num <=255) {
            if (numStr.charAt(0) != '0' ||
                    (numStr.charAt(0) == '0' && numStr.length() == 1)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s="1231231231234";
        System.out.println(new Solution93().restoreIpAddresses(s));
    }
}

package com.swordoffer;

import java.util.*;

/**
 * @author : zhangwei
 * @description : 字符串的排列
 * @date: 2021-10-27 09:48
 */

public class Offer38 {

    public String[] permutation(String s) {
        Set<String> list = new HashSet<>();
        StringBuilder path = new StringBuilder();
        boolean[] used = new boolean[s.length()];
        dfs(s, path, used, list);
        return list.toArray(new String[list.size()]);
    }

    public void dfs(String s, StringBuilder path, boolean[] used, Set<String> list) {
        if (path.length() == s.length()) {
            list.add(path.toString());
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!used[i]) {
                path.append(s.charAt(i));
                used[i] = true;
                dfs(s, path, used, list);
                path.deleteCharAt(path.length() - 1);
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Offer38().permutation("dkjphedy")));
    }


}

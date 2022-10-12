package com.leetcode;

import java.util.LinkedList;

/**
 * @author : zhangwei
 * @description : 简化路径
 * @date: 2021-07-28 09:29
 */

public class Solution71 {

    public String simplifyPath(String path) {
        LinkedList<String> stack = new LinkedList<>();
        String[] pathArr = path.split("/");
        for (int i = 0; i < pathArr.length; i++) {
            if (pathArr[i].equals("") || pathArr[i].equals(".")) {
                continue;
            } else if (pathArr[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(pathArr[i]);
            }
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append("/").append(stack.removeLast());
        }
        if (sb.length() == 0) {
            sb.append("/");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
     //   System.out.println(new Solution71().simplifyPath("/home//foo/"));
        System.out.println(new Solution71().simplifyPath("/a/./b/../../c/"));
    }
}

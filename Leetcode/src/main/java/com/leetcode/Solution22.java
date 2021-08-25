package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 括号生成
 * @date: 2021-08-25 15:53
 */

public class Solution22 {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder("");
        dfs(0, 0, n, path, result);
        return result;
    }


    public void dfs(int left, int right, int n, StringBuilder path, List<String> result) {
        if (left==n && right==n && path.length()==2*n) {
            result.add(path.toString());
            return;
        }
        if(left <right || left>n || right>n){
            return;
        }
        path.append("(");
        dfs(left+1, right, n, path, result);
        path.deleteCharAt(path.length()-1);

        path.append(")");
        dfs(left, right+1 , n, path, result);
        path.deleteCharAt(path.length()-1);
    }

    public static void main(String[] args) {
        System.out.println(new Solution22().generateParenthesis(1));
    }

}

package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 分割回文串
 * @date: 2021-08-26 11:45
 */

public class Solution131 {

    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        List<String> path=new ArrayList<>();
        dfs(s,0,path,result);
        return result;
    }

    public void dfs(String s,int depth,List<String> path,List<List<String>> result){
        if(depth==s.length()){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = depth; i <s.length() ; i++) {
            if(isPalindrome(s,depth,i)) {
                path.add(s.substring(depth, i + 1));
                dfs(s, i + 1, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s,int begin,int end){
        while (begin<end && s.charAt(begin)==s.charAt(end)){
            begin++;
            end--;
        }
        return begin>=end;
    }



    public static void main(String[] args) {
        System.out.println(new Solution131().partition("aab"));
    }
}

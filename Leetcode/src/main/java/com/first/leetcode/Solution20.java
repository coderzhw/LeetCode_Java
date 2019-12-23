package com.first.leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * 有效的括号
 * Created by zhangwei03 on 2019/12/23.
 */
public class Solution20 {

    private HashMap<Character,Character> mappings;

    public Solution20(){
        this.mappings=new HashMap();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

    public  boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(this.mappings.containsKey(c)){
                char topElement=stack.empty()?'#':stack.pop();
                if(topElement!=this.mappings.get(c)){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

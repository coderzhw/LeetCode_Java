package com.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 第一个只出现一次的字符
 * @date: 2021-10-13 11:22
 */

public class Offer50 {

    public char firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
}

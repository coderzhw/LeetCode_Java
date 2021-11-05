package com.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description : 最长不含重复字符的子字符串
 * @date: 2021-11-05 10:32
 */

public class Offer48 {


    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            if(map.containsKey(s.charAt(right))){
                int index=map.get(s.charAt(right));
                if(index>=left){
                    left=index+1;
                }
            }
            map.put(s.charAt(right),right);
            result=Math.max(right-left+1,result);
        }
       return result;

    }


}

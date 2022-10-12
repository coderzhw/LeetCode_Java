package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 最小覆盖子串(滑动窗口的变式)
 */
public class Solution76 {

    public static String minWindow(String s, String t) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        //valid表示目前滑动窗口中有效字符的个数，left、right是两个指针
        // start是字符串起始位置，len是字符串长度
        int valid, left, right, len, start;
        valid = left= start= 0;
        len = Integer.MAX_VALUE;
        for (Character tmp : t.toCharArray()) {
            need.put(tmp, need.getOrDefault(tmp, 0) + 1);
        }
        for (right = 0; right < s.length(); right++) {
            Character cur = s.charAt(right);
            //如果包含了t中的字符就加到window中记录
            if (need.containsKey(cur)) {
                window.put(cur, window.getOrDefault(cur, 0) + 1);
                //这里必须相等才能加，要不然有重复字母的话不能算有效
                if (window.get(cur).equals(need.get(cur))) {
                    valid++;
                }
            }
            //开始收缩窗口
            while (valid == need.size()) {
                //判断左侧字符是不是在t的字符中
                Character leftChar = s.charAt(left);
                if (need.containsKey(leftChar)) {
                    //如果在的话需要更新window窗口和valid
                    if (window.get(leftChar).equals(need.get(leftChar))) {
                        valid--;
                    }
                    window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);

                }
                //这里一定要手动标记start，不能等循环完了再取left-1，因为后面可能会变
                // (main函数的例子单步调试下即可复现这个情况)
                if(right-left+1<len){
                    len =  right - left + 1;
                    start = left;
                }
                left++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

    public static void main(String[] args) {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        System.out.println(minWindow(s, t));
    }
}

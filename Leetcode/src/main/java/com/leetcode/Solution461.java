package com.leetcode;

/**
 * @author : zhangwei
 * @description : 汉明距离
 * @date: 2021-11-19 16:25
 */

public class Solution461 {
    public int hammingDistance(int x, int y) {
        int tmp=x^y;
        int count=0;
        while(tmp!=0){
            tmp=tmp&(tmp-1);
            count++;
        }
        return count;
    }
}

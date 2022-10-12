package com.leetcode;

/**
 * @author : zhangwei
 * @description : 数字范围按位与
 * @date: 2021-09-02 18:49
 */

public class Solution201 {

    public int rangeBitwiseAnd(int left, int right) {
        while (right>left){
            right=right&(right-1);
        }
        return right;
    }

}

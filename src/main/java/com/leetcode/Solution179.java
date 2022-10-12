package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : zhangwei
 * @description : 最大数
 * @date: 2021-08-19 15:19
 */

public class Solution179 {


    public String largestNumber(int[] nums) {
        String[] strArr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (strArr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            sb.append(strArr[i]);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 0};
        System.out.println(new Solution179().largestNumber(nums));
    }


}

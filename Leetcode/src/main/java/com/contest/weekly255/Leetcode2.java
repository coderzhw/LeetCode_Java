package com.contest.weekly255;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode2 {

    public String findDifferentBinaryString(String[] nums) {
        String result = null;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int tmp = Integer.parseInt(nums[i], 2);
            list.add(tmp);
        }
        Collections.sort(list);
        int length = (int) Math.pow(2, nums.length);
        int resultInt = 0;
        for (int i = 0; i < length; i++) {
            if (!list.contains(i)) {
                resultInt = i;
                break;
            }
        }
        String binaryStr = Integer.toBinaryString(resultInt);
        String temp = "";
        if (binaryStr.length() < nums.length) {
            for (int i = 0; i < nums.length - binaryStr.length(); i++) {
                temp += "0";
            }
        }
        result = temp + binaryStr;
        return result;
    }

    public static void main(String[] args) {
        String[] nums = {"111", "011", "001"};
        System.out.println(new Leetcode2().findDifferentBinaryString(nums));
    }
}

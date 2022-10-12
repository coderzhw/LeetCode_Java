package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : zhangwei
 * @description :两个数组的交集
 * @date: 2021-06-02 15:25
 */

public class Solution349 {


    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }

        set1.retainAll(set2);
        if (set1 != null && set1.size() > 0) {
            int[] result = SetToInt(set1);
            return result;
        }
        return new int[0];
    }

    // 将set集合转为整型int数组的方法
    private static int[] SetToInt(Set<Integer> allSet) {
        // 先将set集合转为Integer型数组
        Integer[] temp = allSet.toArray(new Integer[]{});//关键语句

        // 再将Integer型数组转为int型数组
        int[] intArray = new int[temp.length];
        for (int i = 0; i < temp.length; i++) {
            intArray[i] = temp[i].intValue();
        }
        return intArray;
    }

    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }


}

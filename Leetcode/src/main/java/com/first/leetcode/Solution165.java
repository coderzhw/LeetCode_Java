package com.first.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 比较版本号
 */
public class Solution165 {

    public static int compareVersion(String version1, String version2) {

        int[] version1Arr = getFourVersion(version1);
        int[] version2Arr = getFourVersion(version2);
        int length = version1Arr.length > version2Arr.length ? version1Arr.length : version2Arr.length;
        List<Integer> list1 = Arrays.stream(version1Arr).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(version2Arr).boxed().collect(Collectors.toList());
        list1.addAll(Collections.nCopies(length - version1Arr.length, 0));
        list2.addAll(Collections.nCopies(length - version2Arr.length, 0));

        for (int i = 0; i < length; ++i) {
            if (list1.get(i) > list2.get(i)) {
                return 1;
            } else if (list1.get(i) < list2.get(i)) {
                return -1;
            }
        }
        return 0;
    }

    public static int[] getFourVersion(String version) {
        String[] arrStr = version.split("\\.");
        int size = arrStr.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = Integer.valueOf(arrStr[i]);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(compareVersion("1", "1.1"));
    }
}

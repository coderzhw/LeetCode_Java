package com.swordoffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 和为s的连续正数序列
 * @date: 2021-10-18 10:07
 */

public class Offer57II {

    public int[][] findContinuousSequence(int target) {
        List<int[]> result = new ArrayList<>();
        int i = 1, j = 2, sum = 3;
        while (i < j) {
            if (sum == target) {
                int[] tmp = new int[j - i + 1];
                for (int k = i; k <= j; k++) {
                    tmp[k - i] = k;
                }
                result.add(tmp);
                //指针移位
                sum = sum - i;
                i++;
            } else if (sum > target) {
                sum = sum - i;
                i++;
            } else {
                j++;
                sum = sum + j;
            }
        }
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Offer57II().findContinuousSequence(9)));
    }


}

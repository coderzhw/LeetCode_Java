package com.contest.weekly255;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1979 {

    public  int findGCD(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int max = Collections.max(list);
        int min = Collections.min(list);
        return max_common_divisor(max, min);
    }

    public  int max_common_divisor(int a, int b) {
        while (a * b != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a == 0 ? b : a;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        System.out.println(new Solution1979().findGCD(nums));
    }
}

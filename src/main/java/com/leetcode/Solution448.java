package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zhangwei
 * @description : 找到所有数组中消失的数字
 * @date: 2021-11-19 16:36
 */

public class Solution448 {


    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = (nums[i] - 1) % n;
            nums[x] += n;
        }
        for (int i = 0; i < n; i++) {
            if(nums[i]<=n){
                result.add(i+1);
            }else {
                nums[i]=nums[i]%n;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(new Solution448().findDisappearedNumbers(nums));
    }

}

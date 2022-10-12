package com.leetcode;

/**
 * 有效数字
 */
public class Solution65 {

    public boolean isNumber(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        //查找e的位置
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'e' || arr[i] == 'E') {
                if (idx == -1) {
                    idx = i;
                } else {
                    //找到了多个e直接返回
                    return false;
                }
            }
        }
        boolean ans = true;
        if (idx != -1) {
            ans = ans && check(arr, 0, idx, false);
            ans = ans && check(arr, idx + 1, n, true);
        } else {
            ans = ans && check(arr, 0, n, false);
        }
        return ans;
    }


    public boolean check(char[] nums, int start, int end, boolean isInteger) {
        if (start > end) return false;
        boolean hasDot = false;
        boolean hasNum = false;
        //這個爲什麽不放到循环里面判断呢？因为加号或者减号出现多个或者出现在中间都是有问题的
        //即便用一个布尔变量也不知道是不是出现在中间位置
        if (start < end && (nums[start] == '+' || nums[start] == '-')) {
            start++;
        }
        for (int i = start; i < end; i++) {
            if (nums[i] == '.') {
                if (hasDot || isInteger) {
                    return false;
                } else {
                    hasDot = true;
                }
            } else if (Character.isDigit(nums[i])) {
                hasNum = true;
            } else {
                return false;
            }
        }
        return hasNum;
    }

    public static void main(String[] args) {
        System.out.println(new Solution65().isNumber("0e"));
    }
}

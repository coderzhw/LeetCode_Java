package com.leetcode;

/**
 * @author : zhangwei
 * @description : 快乐数
 * @date: 2021-07-13 10:31
 */

public class Solution202 {

    public boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        while (true) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
            if (slow == 1 || fast == 1) {
                return true;
            }
            if (slow == fast) {
                return false;
            }
        }
    }

    public int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(new Solution202().isHappy(19));
    }

}

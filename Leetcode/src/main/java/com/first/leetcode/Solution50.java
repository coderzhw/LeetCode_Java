package com.first.leetcode;

/**
 * Pow(x,n)
 */
public class Solution50 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            return myPowPositiveN(x, n);
        } else {
            return 1 / myPowPositiveN(x, n);
        }
    }

    public double myPowPositiveN(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double half = myPowPositiveN(x, n / 2);
        if (n % 2 != 0) {
            return x * half * half;
        }
        return half * half;
    }

    public static void main(String[] args) {

    }

}

package com.contest.weekly259;

public class Solution5875 {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.equals("++X")) {
                ++result;
            } else if (operation.equals("X++")) {
                result++;
            } else if (operation.equals("--X")) {
                --result;
            } else if (operation.equals("X--")) {
                result--;
            }
        }
        return result;
    }
}

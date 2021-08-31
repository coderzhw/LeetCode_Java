package com.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 杨辉三角 II
 */
public class Solution119 {

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> all = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                LinkedList<Integer> list = new LinkedList<>();
                list.add(i + 1);
                all.add(list);
            } else {
                LinkedList<Integer> list1 = new LinkedList<>(all.get(i - 1));
                LinkedList<Integer> list2 = new LinkedList<>(all.get(i - 1));
                list1.addFirst(0);
                list2.addLast(0);
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < list1.size(); j++) {
                    list.add(list1.get(j) + list2.get(j));
                }
                all.add(list);
            }
        }
        return all.get(rowIndex);
    }

    public static void main(String[] args) {
        System.out.println(new Solution119().getRow(3));
    }
}

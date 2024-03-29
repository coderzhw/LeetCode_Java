package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 表示数值的字符串
 * @date: 2021-11-09 11:00
 */

public class Offer20 {

    public boolean isNumber(String s) {
        char[] arr = s.trim().toCharArray();
        if (arr.length == 0) return false;
        int index = 0;
        if (arr[index] == '+' || arr[index] == '-') {
            index++;
        }
        int cur = index;
        index = scanUnsignedInteger(arr, index);
        boolean numeric = (index > cur);
        if (index < arr.length && arr[index] == '.') {
            //略过小数点
            index++;
            cur = index;
            index = scanUnsignedInteger(arr, index);
            numeric = (index > cur) || numeric;
        }
        if (index < arr.length && (arr[index] == 'e' || arr[index] == 'E')) {
            //略过e/E
            index++;
            //略过符号位
            if (index < arr.length &&(arr[index] == '+' || arr[index] == '-')) {
                index++;
            }
            cur = index;
            index = scanUnsignedInteger(arr, index);
            numeric = (index > cur) && numeric;
        }
        return numeric && index == arr.length;
    }

    public int scanUnsignedInteger(char[] arr, int index) {
        while (index < arr.length && arr[index] >= '0' && arr[index] <= '9') {
            index++;
        }
        return index;
    }


    public static void main(String[] args) {
        System.out.println(new Offer20().isNumber("e"));
    }
}

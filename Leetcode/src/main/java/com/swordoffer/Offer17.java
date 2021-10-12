package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 打印从1到最大的n位数
 * @date: 2021-10-12 10:00
 */

public class Offer17 {
    public int[] printNumbers(int n) {
        int num=(int)Math.pow(10,n);
        int[] result=new int[num-1];
        for(int i=1;i<num;i++){
            result[i-1]=i;
        }
        return result;
    }
}

package com.swordoffer;

/**
 * @author : zhangwei
 * @description :旋转数组的最小数字
 * @date: 2021-10-09 14:25
 */

public class Offer11 {
    public int minArray(int[] numbers) {
        if(numbers.length==1) return numbers[0];
        for(int i=0;i<numbers.length-1;i++){
            if(numbers[i]>numbers[i+1]){
                return numbers[i+1];
            }
        }
        return numbers[0];
    }

}

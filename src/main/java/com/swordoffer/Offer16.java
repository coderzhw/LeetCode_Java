package com.swordoffer;

/**
 * 数值的整数次方
 */
public class Offer16 {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        if(n==Integer.MIN_VALUE && x>0) return 1/myPow(x,Integer.MAX_VALUE);
        if(n==Integer.MIN_VALUE && x<0) return -1/myPow(x,Integer.MAX_VALUE);
        if(n<0) return 1/myPow(x,-n);
        double t=myPow(x,n/2);
        if(n%2==0){
            return t*t;
        }else{
            return t*t*x;
        }
    }
}

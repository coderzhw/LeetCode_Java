package com.swordoffer;

/**
 * @author : zhangwei
 * @description : 1～n 整数中 1 出现的次数
 * @date: 2021-11-12 11:46
 */

public class Offer43 {


    public int countDigitOne(int n) {
        int digital = 1;
        int cur = n % 10;
        int low = 0;
        int high = n / 10;
        int res = 0;
        while (cur != 0 || high != 0) {

            if (cur == 0) res += high * digital;
            else if (cur == 1) res += high * digital + low + 1;
            else res += (high + 1) * digital;
            //这几个的算法顺序不能随意颠倒，需要细细体会
            low = low + digital * cur;
            cur = high % 10;
            digital = digital * 10;
            high = high / 10;
        }

        return res;
    }


}

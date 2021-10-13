package com.swordoffer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : zhangwei
 * @description :
 * @date: 2021-10-13 11:09
 */

public class Offer39 {

    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>nums.length/2){
                return nums[i];
            }
        }
        return -1;
    }
}

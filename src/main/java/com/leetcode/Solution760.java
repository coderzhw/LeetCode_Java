package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution760 {
    
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
         Map<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int i=0;i<nums2.length;i++){
             map.put(nums2[i], i);
         }

         for(int i=0;i<nums1.length;i++){
             result[i]=map.get(nums1[i]);
         }
        return result;
    }  
}

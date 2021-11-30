package com.leetcode;

/**
 * @author : zhangwei
 * @description : 寻找两个正序数组的中位数
 * @date: 2021-11-25 10:31
 */

public class Solution4 {


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m=nums1.length;
        int n=nums2.length;

        int left=(m+n+1)/2;

        int right=(m+n+2)/2;

        return (getKNum(nums1,0,m-1,nums2,0,n-1,left)+
                getKNum(nums1,0,m-1,nums2,0,n-1,right))/2.0;

    }

    public int getKNum(int[] nums1,int begin1,int end1,int[] nums2,int begin2,int end2,int k){
        System.out.println("===========k==="+k);
        int len1=end1-begin1+1;
        int len2=end2-begin2+1;
        if(len1>len2) return getKNum(nums2,begin2,end2,nums1,begin1,end1,k);
        if(len1==0) return nums2[begin2+k-1];
        if(k==1) return Math.min(nums1[begin1],nums2[begin2]);
        //找到k/2一半的位置点
        int i=begin1+Math.min(len1,k/2)-1;
        int j=begin2+Math.min(len2,k/2)-1;
        //这里不要死记硬背，举一个例子,看k如何流转的 nums1: 1 3 5 7 9 nums2: 24 6 8 10 ,k=5
        if(nums1[i]<nums2[j]){
          return   getKNum(nums1,i+1,end1,nums2,begin2,end2,k-(i-begin1+1));
        }else {
          return   getKNum(nums1,begin1,end1,nums2,j+1,end2,k-(j-begin2+1));
        }
    }


    public static void main(String[] args) {
        int [] nums1={1,3,5,7,9};
        int[] nums2={2,4,6,8,10};
        System.out.println(new Solution4().findMedianSortedArrays(nums1,nums2));
    }





}

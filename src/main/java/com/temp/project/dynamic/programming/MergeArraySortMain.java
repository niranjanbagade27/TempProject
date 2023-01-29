package com.temp.project.dynamic.programming;

import java.util.Arrays;

public class MergeArraySortMain {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++)
            nums1[i + m] = nums2[i];
        Arrays.sort(nums1);
    }

    public static int n=1;
    public static int[] nums2=new int[]{1};
//    public int init=3;
    public static int m=1;
    public static int[] nums1= new int[]{2,0};

    public static void main(String[] args) {
        new MergeArraySortMain().merge(nums1,m,nums2,n);
        for(int i:nums1)
            System.out.print(i+",");
    }
}

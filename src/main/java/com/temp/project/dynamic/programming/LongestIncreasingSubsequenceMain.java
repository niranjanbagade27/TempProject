package com.temp.project.dynamic.programming;

import java.util.Arrays;

public class LongestIncreasingSubsequenceMain {

    public int LIS(int nums[]){
//        for(int num:nums) System.out.println(num);

        int seq[] = new int[nums.length];
        for (int i=0;i<nums.length;i++) {
            seq[i]=1;
        }

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<=nums[i] && seq[i]<=seq[j]){
                    seq[i] = seq[i]+1;
                }
            }
        }

        Arrays.sort(seq);

        return seq[seq.length-1];
    }

    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequenceMain().LIS(new int[]{0,9,7,1,2,2,2,2,4,5,2,6,9,1,3,14}));
    }
}

package com.temp.project.dynamic.programming;

import java.util.*;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int closestSum=0;
        Arrays.sort(nums);

        int minusA = 0,j=0,k=0;
        int diffFromTarget=0,b=0,c=0;

        for(int i=0;i<nums.length-2;i++){
            minusA = -nums[i];
            j=i+1;
            k=nums.length-1;
            while(j<k){
                b=nums[j];
                c=nums[k];
                if(minusA == b+c){
                    closestSum = 0;
                }else{
                    diffFromTarget = minusA - (b+c);
                    if(diffFromTarget < closestSum){
                        closestSum = diffFromTarget;
                    }
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{-1,2,1,-4},1));
    }
}

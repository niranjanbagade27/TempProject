package com.temp.project.dynamic.programming;

import java.util.*;
import java.util.stream.Collectors;

public class ContainerWithMostWaterMain {

    public int maxArea(int[] height) {
        int area = 0;
        List<String> blacklist = new LinkedList<String>();
//        for(int i=0;i<height.length;i++){
//            for(int j=height.length-1;j>i;j--){
//                if(!blacklist.contains(Math.min(height[i],height[j])+"_"+Math.max(height[i],height[j]))){
//                    if(Math.min(height[i],height[j])<=Math.max(height[i],height[j]) && area < Math.min(height[i],height[j])*(j-i)) {
//                        area = Math.min(height[i], height[j]) * (j - i);
//                    }
//                }else{
//                    blacklist.add(Math.min(height[i],height[j])+"_"+Math.max(height[i],height[j]));
//                }
//            }
//        }
        int i=0;
        int j=height.length-1;
        int newArea = 0;
        while(i<j){
            newArea = Math.min(height[i],height[j]) * (j - i);
            area = Math.max(area, newArea);
            if(height[i]<=height[j]) i++;
            else if(height[i]>height[j]) j--;
        }

        return area;
    }

    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWaterMain().maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        //System.out.println(new ContainerWithMostWaterMain().maxArea(new int[]{1,1}));
    }
}

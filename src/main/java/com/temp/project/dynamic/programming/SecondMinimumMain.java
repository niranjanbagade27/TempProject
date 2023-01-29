package com.temp.project.dynamic.programming;

public class SecondMinimumMain {


    private int getSecondMinimimum(int[] ints) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int len = ints.length;
        for(int i=0;i<len;i++){
            if(ints[i] < min && ints[i] < secondMin){
                secondMin = min;
                min = ints[i];
            }else if(ints[i] < secondMin && ints[i] > min){
                secondMin = ints[i];
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        System.out.println(new SecondMinimumMain().getSecondMinimimum(new int[]{9,8,3,4,6,3,5}));
    }

}

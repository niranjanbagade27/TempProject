package com.temp.project.dynamic.programming;

import java.util.*;

public class NearestGreaterToLeftMain {

    private List<Integer> nearestGreaterToLeftMain(int nums[]){
        List<Integer> result = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<nums.length;i++){
            if(i==0){
                result.add(-1);
                stack.push(nums[i]);
            }else{
                int n=-1;
                while(!stack.isEmpty()){
                    n = stack.pop();
                    if(n>nums[i]){
                        result.add(n);
                        stack.push(nums[i]);
                        break;
                    }
                }
                if(stack.isEmpty()){
                    result.add(-1);
                    stack.push(nums[i]);
                }
            }
        }
        //Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new NearestGreaterToLeftMain().nearestGreaterToLeftMain(new int[]{1,3,2,4}));
    }
}

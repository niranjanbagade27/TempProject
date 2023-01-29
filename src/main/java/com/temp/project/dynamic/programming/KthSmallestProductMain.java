package com.temp.project.dynamic.programming;

import java.util.ArrayList;
import java.util.Collections;

public class KthSmallestProductMain {

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        int len1 = nums1.length;
        int len2 = nums2.length;
        int i=0;
        int j=len2-1;
        int x=0;
        int y=len1-1;
        ArrayList<Integer> sorted = new ArrayList<>();
        //int smallest = Integer.MAX_VALUE;
        //int cnt = 0;
        while(i<len1 && x<len2){


            if(!((nums1[i]<0 && nums1[y]<0 && nums2[x]<0 && nums2[y]<0)||
                    (nums1[i]>0 && nums1[y]>0 && nums2[x]>0 && nums2[y]>0))){
                int mul1 = nums1[i]*nums2[j];
                int mul2 = nums2[x]*nums1[y];
                if(mul1<mul2){
                    j--;

                    sorted.add(mul1);
                    if(sorted.size()==k){
                        Collections.sort(sorted);
                        return sorted.get((int)k-1);
                    }
                }else if(mul1>mul2){
                    y--;

                    sorted.add(mul2);
                    if(sorted.size()==k){
                        Collections.sort(sorted);
                        return sorted.get((int)k-1);
                    }
                }else{
                    i++;
                    j--;
                    x++;
                    y--;
                }
            }else{
                int mul1 = nums1[i]*nums2[j];
                int mul2 = nums2[x]*nums1[y];

                if(mul1<mul2){
                    //i++;
                    //x++;
                    j--;

                    sorted.add(mul1);
                    if(sorted.size()==k){
                        Collections.sort(sorted);
                        return sorted.get((int)k-1);
                    }
                }else if(mul1>mul2){
                    //j--;
                    y--;

                    sorted.add(mul2);
                    if(sorted.size()==k){
                        Collections.sort(sorted);
                        return sorted.get((int)k-1);
                    }
                }else{
                    i++;
                    x++;
                    j--;
                    y--;

                    sorted.add(mul1);
                    if(sorted.size()==k){
                        Collections.sort(sorted);
                        return sorted.get((int)k-1);
                    }
                }

            }


        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new KthSmallestProductMain().kthSmallestProduct(
                new int[]{-4,-2,0,3},
                new int[]{2,4},
                6));
        // -16,-8,
        // [5,6]
        // [2,4]
    }
}

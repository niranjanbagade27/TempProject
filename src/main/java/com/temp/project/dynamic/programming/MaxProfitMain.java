package com.temp.project.dynamic.programming;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MaxProfitMain {
    int profit = 0;
    public int maxProfit(int[] prices) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int profitSoFar = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min = prices[i];
            }else {
                if(profitSoFar < prices[i] - min)
                    profitSoFar = prices[i] - min;
            }
        }

        return profitSoFar;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfitMain().maxProfit(new int[]{2,4,2,1,8,19,1,3,21}));
    }
}

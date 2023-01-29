package com.temp.project.dynamic.programming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StepsMain {

    public int nWays=0;
    public Map<Integer,Integer> waysFromHere = new HashMap<Integer,Integer>();

    public int climbStairs(int n) {
        if(n -1<=0) return 1;
        if(waysFromHere.get(n)!=null) return waysFromHere.get(n);
        nWays = climbStairs(n -1) + climbStairs(n-2);
        waysFromHere.put(n,nWays);
        return nWays;
    }

    public static void main(String[] args) {
        System.out.println(new StepsMain().climbStairs(3));
    }
}

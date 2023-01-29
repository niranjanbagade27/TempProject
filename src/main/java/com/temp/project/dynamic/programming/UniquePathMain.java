package com.temp.project.dynamic.programming;

import java.util.HashMap;
import java.util.Map;

public class UniquePathMain {

    public int nWays = 0;
    public Map<String, Integer> waysFromHere = new HashMap<String, Integer>();

    public int uniquePaths(int rows, int columns) {
        if(rows-1<=0||columns-1<=0)return 1;
        if(waysFromHere.get(rows+","+columns)!=null||waysFromHere.get(columns+","+rows)!=null) return waysFromHere.get(rows+","+columns);

        nWays = uniquePaths(rows, columns-1) + uniquePaths(rows-1, columns);

        waysFromHere.putIfAbsent(rows+","+columns,nWays);
        waysFromHere.putIfAbsent(columns+","+rows,nWays);
        return nWays;
    }

    public static void main(String[] args) {
        long start = System.nanoTime();
//        System.out.println(start);
        System.out.println(new UniquePathMain().uniquePaths(23,12));
        System.out.println((System.nanoTime()-start)/1000000);
    }

}

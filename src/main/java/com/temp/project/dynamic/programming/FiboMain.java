package com.temp.project.dynamic.programming;

import java.util.HashMap;

public class FiboMain {
    public static void main(String[] args) {
        long f = fibo(50,new HashMap<Long,Long>());
        System.out.println(f);
    }

    private static long fibo(long i,HashMap<Long, Long> mem) {

        if(null!=mem.get(i)){
            return mem.get(i);
        }

        if(i==1 || i == 0){
            mem.put(i,i);
            return i;
        }
        else{
            long result = fibo(i-1,mem) + fibo(i-2, mem);
            mem.put(i,result);
            return result;
        }
    }
}

// 3
// 0 1 2 3 4
// 0 1 1 2 3 5 8

package com.temp.project.dynamic.programming.treegraph.first;

public class JosephusProblem {


    private int jos(int n, int k) {
        if(n==1) return 0;
        return (jos(n-1,k)+k)%n;
    }

    public static void main(String[] args) {
        JosephusProblem jp = new JosephusProblem();
        int res = jp.jos(9,2);
        System.out.println(res);
    }
}

package com.temp.project.dynamic.programming.knapsack;

public class SubsetSumMain {

    public boolean solve(boolean[][] t, int w, int val[], int n) {

        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(j==0){
                    t[i][j]=true;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (j >= val[i-1]) {
                    t[i][j] = t[i-1][j-val[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[n][w];
    }


    public static void main(String[] args) {
        SubsetSumMain obj = new SubsetSumMain();

        int val[] = new int[]{1, 2, 5, 3, 10};
        int sum =22;
        boolean t[][] = new boolean[val.length + 1][sum + 1];

        System.out.println(obj.solve(t, sum, val, val.length));

    }
}

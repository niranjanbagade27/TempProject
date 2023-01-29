package com.temp.project.dynamic.programming.knapsack;

public class CountOfSubsetSumWithGIvenSum {

    public int countOfSubsetSum(int[] arr, int target) {
        int sum = 0;
        int m = arr.length;
        int n = target;
        int t[][] = new int[m + 1][n + 1];

        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (j == 0) t[i][j] = 1;
            }
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (arr[i-1] <= j){
                    t[i][j] = t[i-1][j] + t[i-1][j-arr[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        }

        return t[m][n];
    }

    public static void main(String[] args) {
        System.out.println("Number of equal sum partitions is " + new CountOfSubsetSumWithGIvenSum().countOfSubsetSum(new int[]{1, 5, 5, 11, 6,4}, 11));
    }
}

package com.temp.project.dynamic.programming.knapsack;

import java.util.Arrays;

public class MinimumSubsetSumDiffMain {

    public int minimumSubsetSum(int[] arr) {

        int n = arr.length;
        int w = sum(arr);

        boolean[][] t = new boolean[n + 1][w + 1];

        for (int i = 0; i < n + 1; i++) {
            t[i][0] = true;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (j >= arr[i - 1]) {
                    t[i][j] = t[i - 1][j - arr[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        /*[
                [true, false, false, false, false, false, false, false, false, false, false],
                [true, true, false, false, false, false, false, false, false, false, false],
                [true, true, true, true, false, false, false, false, false, false, false],
                [true, true, true, true, false, false, false, true, true, true, true]
        ]*/
        System.out.println(Arrays.deepToString(t));

        int min = Integer.MAX_VALUE;

        for (int j = 0; j < (w + 1)/2; j++) {
            if(t[n][j]){
                min = Math.min(min, w - (2*j));
            }
        }

        return min;
    }

    private int sum(int[] arr) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Number of equal sum partitions is " + new MinimumSubsetSumDiffMain().minimumSubsetSum(new int[]{1, 2, 7}));
    }
}

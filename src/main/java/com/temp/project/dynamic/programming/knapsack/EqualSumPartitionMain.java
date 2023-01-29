package com.temp.project.dynamic.programming.knapsack;

public class EqualSumPartitionMain {
    public static void main(String[] args) {
        EqualSumPartitionMain obj = new EqualSumPartitionMain();

        int arr[] = new int[]{1, 5, 11, 3};
        int n = arr.length;
        int sum = obj.total(arr) / 2;

        boolean t[][] = new boolean[n + 1][sum + 1];

        System.out.println(obj.solve(t, arr, sum, n));
    }

    private boolean solve(boolean[][] t, int[] arr, int w, int n) {
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < w + 1; j++) {
                if (j == 0) t[i][j] = true;
            }
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
        return t[n][w];
    }

    public int total(int arr[]) {
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return sum;
    }
}

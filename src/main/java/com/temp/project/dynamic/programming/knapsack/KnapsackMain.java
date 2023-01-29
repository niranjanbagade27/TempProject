package com.temp.project.dynamic.programming.knapsack;

public class KnapsackMain {

    public int knapsack(int[] wt, int[] val, int n, int w) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (w >= wt[n - 1]) {
            return Math.max(val[n - 1] + knapsack(wt, val, n - 1, w - wt[n - 1]), knapsack(wt, val, n - 1, w));
        }

        return knapsack(wt, val, n - 1, w);
    }

    private int knapsackDP(int[] wt, int[] val, int n, int w, int[][] t) {

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < w + 1; j++) {
                if (i == 0 || w == 0) t[i][j] = 0;
                else if (j >= wt[i - 1]) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][w];
    }

    public static void main(String[] args) {
        int[] val = new int[]{1, 3, 4, 5};
        int[] wt = new int[]{1, 4, 5, 7};
        int n = 4;
        int w = 7;

        System.out.println(new KnapsackMain().knapsack(wt, val, n, w));

        int[][] t = new int[n + 1][w + 1];

        System.out.println(new KnapsackMain().knapsackDP(wt, val, n, w, t));

    }

}

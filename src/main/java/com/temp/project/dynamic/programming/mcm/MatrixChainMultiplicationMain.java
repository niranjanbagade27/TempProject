package com.temp.project.dynamic.programming.mcm;

import java.util.Arrays;
import java.util.HashMap;

public class MatrixChainMultiplicationMain {

    static int t[][] = null;

    private int solve(int[] ints, int i, int j) {
        if (i >= j) {
            return 0;
        }

        if (t[i][j] != -1) {
            return t[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp1 = solve(ints, i, k) + solve(ints, k + 1, j) + (ints[i - 1] * ints[k] * ints[j]);
            min = Math.min(temp1, min);
        }

        t[i][j] = min;

        return min;
    }

    public static void main(String[] args) {
        MatrixChainMultiplicationMain obj = new MatrixChainMultiplicationMain();
        int[] ints = new int[]{10, 30, 5, 60};
        t = new int[ints.length + 1][ints.length + 1];
        for(int[] row : t)
            Arrays.fill(row, -1);

        System.out.println(obj.solve(ints, 1, ints.length - 1));
    }

}

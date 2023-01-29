package com.temp.project.dynamic.programming.mcm;

import java.util.Arrays;

public class PalindromePartitioningMain {

    static int t[][] = null;

    private int minPart(String str, int i, int j) {

        if (i >= j || isPali(str, i, j)) {
            return 0;
        }

        if(t[i][j]!=-1){
            return t[i][j];
        }

        int min = Integer.MAX_VALUE;

        for (int k = i; k < j; k++) {
            int temp = 1 + minPart(str, i, k) + minPart(str, k + 1, j);
            min = Math.min(min, temp);
        }

        t[i][j] = min;

        return min;
    }

    private boolean isPali(String string, int i, int j) {
        while(i < j)
        {
            if(string.charAt(i) != string.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmmmmqrstuvwxyz";
        t = new int[str.length()][str.length()];

        for(int[] row : t){
            Arrays.fill(row, -1);
        }

        PalindromePartitioningMain obj = new PalindromePartitioningMain();
        System.out.println(obj.minPart(str, 0, str.length() - 1));
    }
}

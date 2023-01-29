package com.temp.project.dynamic.programming.treegraph.first;

public class TowerOfHanoi {
    private int cnt = 0;

    public void toh(int n, int sourse, int temp, int dest) {
        if (n == 0) return;
        cnt++;
        toh(n - 1, sourse, temp, dest);
        toh(n - 1, temp, dest, sourse);
    }

    public static void main(String[] args) {
        TowerOfHanoi t = new TowerOfHanoi();
        t.toh(5, 0, 0, 0);
        System.out.println(t.cnt);
    }
}

package com.temp.project.dynamic.programming.sorting;

public class QuickSortMain {
    static int ints[] = new int[]{2,7,5,8,9,1,7};
    public void swap(int ints[], int low, int high){
        int temp = ints[low];
        ints[low] = ints[high];
        ints[high] = temp;
    }

    private int[] quickSort(int[] ints,int low,int high) {

        if(low<high){
            //int pivot = ints[high];

            int pivot = partition(ints,low,high);

            quickSort(ints, low, pivot - 1);
            quickSort(ints, pivot + 1, high);
        }

        return ints;
    }

    private int partition(int[] ints, int low, int high) {
        int pivot = ints[high];
        int i = low-1;
        int j = low;
        for(j=low;j<=high-1;j++){
            if(ints[j] < pivot){
                i++;
                swap(ints, i,j);
            }
        }

        swap(ints,i+1,high);
        return i+1;
    }

    public static void main(String[] args) {
        int len = ints.length;
        int pivot = len-1;
        int high = len-1;
        int low = 0;
        for(int num : new QuickSortMain().quickSort(ints,low,high)){
            System.out.println(num);
        }
    }
}

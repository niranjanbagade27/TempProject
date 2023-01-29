package com.temp.project.assignment;

public class Main2 {
    public static void main(String[] args) {
        int n = 5;

        // get the max length of the string
        // if n=4, l=7 = 4+(4-1)

        for(int i=1;i<=n;i++){ //
            int j = 1;
            for(j=1;j<=n-i;j++){
                System.out.print("-");
            }
            int k=1;
            while(j<=n){
                System.out.print(k);
                k++;
                j++;
            }
            k--;
            k--;
            while(k>0){
                System.out.print(k);
                k--;
            }
            System.out.println();
        }
        System.out.println("end");
    }
}

/*
---1
--121
-12321
1234321

123454321

n=4

 */
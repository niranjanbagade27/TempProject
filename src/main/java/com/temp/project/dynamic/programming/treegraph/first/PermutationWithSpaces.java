package com.temp.project.dynamic.programming.treegraph.first;

public class PermutationWithSpaces {


    private static void generatePermutation(String op, String ip) {
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        String op1 = new String(op);
        String op2 = new String(op);

        op1 = op1+"_"+ip.charAt(0);
        op2 = op2+ip.charAt(0);

        ip = ip.substring(1,ip.length());

        generatePermutation(op1,ip);
        generatePermutation(op2,ip);

    }

    public static void main(String[] args) {
        generatePermutation("a","bc");
    }
}

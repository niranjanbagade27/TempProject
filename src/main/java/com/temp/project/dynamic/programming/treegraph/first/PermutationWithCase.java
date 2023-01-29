package com.temp.project.dynamic.programming.treegraph.first;

public class PermutationWithCase {

    public static void main(String[] args) {
        permutation("","ab");
    }

    private static void permutation(String op, String ip) {
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        String op1 = new String(op);
        String op2 = new String(op);

        op1 = op1+ip.charAt(0);
        op2 = op2+ip.toUpperCase().charAt(0);

        ip = ip.substring(1,ip.length());

        permutation(op1,ip);
        permutation(op2,ip);
    }
}

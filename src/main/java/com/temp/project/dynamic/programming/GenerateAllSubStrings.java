package com.temp.project.dynamic.programming;

public class GenerateAllSubStrings {

    static void generate(String op, String ip){
        if(ip.isEmpty()){
            System.out.println(op);
            return;
        }

        String op1 = new String(op.toString());
        String op2 = new String(op.toString());
        op2 = op2+ip.charAt(0);
        ip = ip.substring(1,ip.length());
        generate(op1,ip);
        generate(op2,ip);
    }


    public static void main(String[] args) {
        generate("","ABC");
    }
}

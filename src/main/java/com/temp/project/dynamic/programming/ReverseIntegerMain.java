package com.temp.project.dynamic.programming;

import java.io.PrintStream;

public class ReverseIntegerMain {
    public int reverse(int x) {
        String str = ""+x;

        if(str.length()==1)
            return x;

        if(x>=Integer.MAX_VALUE)
            return 0;

        int result = 0;
        StringBuffer sb = new StringBuffer(str);
        if(isSign(sb.toString())){
            sb = sb.deleteCharAt(0);
            result = Integer.parseInt("-"+zeroRemoved(sb.reverse().toString()));
        }else{
            result = Integer.parseInt(zeroRemoved(sb.reverse().toString()));
        }
        return result;
    }

    private String zeroRemoved(String reverse) {
        int i=0;
        StringBuffer sb = new StringBuffer(reverse);
        while(sb.charAt(i)=='0'){
            sb.deleteCharAt(i);
        }
        return sb.toString();
    }

    public boolean isSign(String s){
        StringBuffer sb = new StringBuffer(s);
        if(sb.reverse().toString().charAt(sb.length()-1)=='-'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseIntegerMain().reverse(1534236469));
    }
}

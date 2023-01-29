package com.temp.project.dynamic.programming;

import java.util.Stack;

public class ValidParenthesisString {

    public Stack<Character> stack = new Stack<>();

    public boolean canBeValid(String s, String locked) {
        boolean result = false;
        System.out.println(s.length());
        int [] changeHist = new int[locked.length()];
        result = check(s,locked,changeHist);
        return result;
    }

    private boolean check(String s, String locked, int[] changeHist) {



        return false;
    }



    /*private boolean check(String s, String locked) {
        if(s.length()==0 && stack.isEmpty())
            return true;

        for (int i=0;i<s.length();) {
            if (s.charAt(i) == ')' && locked.charAt(i) == '0' && stack.isEmpty()) {
                s = "(" + s.substring(1);
                return check(s, locked);
            }else if(s.charAt(i) == ')' && locked.charAt(i) == '0' && !stack.isEmpty()){
                s=s.substring(1);
                stack.pop();
                locked = locked.substring(1);
            }else if(s.charAt(i)=='('){
                if(!stack.isEmpty() && locked.charAt(i)=='0'){
                    s=")"+s.substring(1);
                    return check(s,locked);
                }
                stack.push(')');
                s=s.substring(1);
                locked = locked.substring(1);
            }else if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
                s=s.substring(1);
                locked = locked.substring(1);
            }else{
                return false;
            }
        }
        if(s.length()==0 && stack.isEmpty())
            return true;
        return false;
    }*/


    public static void main(String[] args) {
//        "((()(()()))()((()()))))()((()(()"
//        "((()(()()))()((()()))))()((()(()"
//        "10111100100101001110100010001001"
        System.out.println(new ValidParenthesisString().canBeValid("((()(()()))()((()()))))()((()(()","10111100100101001110100010001001"));
    }

}

package com.temp.project.dynamic.programming;

import java.util.Stack;

public class LongestValidParenthesesMain {

    public int longestValidParentheses(String s) {
        // ) ( => count+2
        // ) ) => push
        // ( ( => reset
        // ( ) => reset
        int result = 0;
        int grandTotal = 0;
        Stack<Character> stack = new Stack<Character>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==')' && stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)=='(' && stack.isEmpty()){
                if(grandTotal<result)
                    grandTotal = result;
                result = 0;
            }else if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)=='(' && !stack.isEmpty()){
                stack.pop();
                result+=2;
                if(grandTotal<result)
                    grandTotal=result;
            }
        }
        return grandTotal;
    }

    public static void main(String[] args) {
        System.out.println(new LongestValidParenthesesMain().longestValidParentheses("()()()((()()()))(()())"));
    }
}

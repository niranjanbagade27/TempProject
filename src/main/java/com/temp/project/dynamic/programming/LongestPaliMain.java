package com.temp.project.dynamic.programming;

import org.apache.commons.lang3.stream.Streams;

import java.util.Stack;
import java.util.stream.Stream;

public class LongestPaliMain {

    int longestPaliStart = 0;
    int longestPaliLength = 1;

    public String longestPalindrome(String s) {
        if(s.length()==1)
            return s;

        for(int i=0;i<s.length();i++){
            moveFromTheMiddle(s,i,i);
            moveFromTheMiddle(s,i,i+1);
        }
        return s.substring(longestPaliStart,longestPaliStart+longestPaliLength);
    }

    public void moveFromTheMiddle(String s, int start, int end){
        while(start>= 0 && end < s.length()){
            if(s.charAt(start) == s.charAt(end)){
                start--;
                end++;
            }else{
                break;
            }
        }
        end--;
        start++;
        if(longestPaliLength <= (end - start)){
            longestPaliStart = start;
            longestPaliLength = (end+1) - start;
        }
    }

    public static void main(String[] args) {
        System.out.println("longest Pali is "+new LongestPaliMain().longestPalindrome("cbbd"));
    }
}

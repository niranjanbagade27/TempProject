package com.temp.project.dynamic.programming;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthesisMain {

    public List<String> result = new LinkedList<String>();
    public List<String> generateParenthesis(int n) {
        addPara(0,0,n,"",result);
        return result;
    }

    private void  addPara(int numOfOpen, int numOfClose,int n,String s,List<String> result) {
        if(s.length()==(n*2) && !result.contains(s))
            result.add(s);

        if(numOfOpen<n){
            addPara(numOfOpen+1,numOfClose,n,s+"(",result);
        }
        if(numOfClose<numOfOpen){
            addPara(numOfOpen,numOfClose+1,n,s+")",result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new GenerateParanthesisMain().generateParenthesis(3));
    }
}

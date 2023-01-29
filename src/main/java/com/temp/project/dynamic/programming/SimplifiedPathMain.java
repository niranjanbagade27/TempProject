package com.temp.project.dynamic.programming;

import java.util.*;

public class SimplifiedPathMain {
    public String simplifyPath(String path) {


        path = path.replace("//","/");
        String []str = path.split("/");
        List<String> stack = new LinkedList<String>();
        for(String s: str){
            if(s.equals("..")){
                if(stack.size()!=0)
                    stack.remove(stack.size()-1);
            }else if(s.length()==0||s.equals(".")){

            }else{
                stack.add(s);
            }
        }

        String finalStr="/";

        for(int i=0;i<stack.size();i++){
            finalStr+=stack.get(i);
            finalStr+="/";
        }

        if(finalStr.isEmpty() || finalStr=="/"){
            return "/";
        }else
            return finalStr.substring(0,finalStr.length()-1);


    }

    public static void main(String[] args) {
        System.out.println(new SimplifiedPathMain().simplifyPath("/a/./b/../../c/"));
    }
}

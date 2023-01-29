package com.temp.project.dynamic.programming;

import java.util.Stack;

public class MaxAreaHistogramMain {

    class CompositStatk{
        public int index;
        public int height;

        public CompositStatk(int index, int height){
            this.index = index;
            this.height = height;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getIndex() {
            return index;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "CompositStatk{" +
                    "index=" + index +
                    ", height=" + height +
                    '}';
        }
    }

    public int largestRectangleArea(int[] hist) {
        int len = hist.length;
//        int areas[] = new int[len];
        print(hist);
        System.out.println();
//        int str[] = new int[len];
//        str = smallestToRight(hist);
//        print(str);
//        int stl[] = new int[len];
//        stl = smallestToLeft(hist);
//        print(stl);

        int max = Integer.MIN_VALUE;

        Stack<CompositStatk> stack = new Stack<>();
        CompositStatk top = new CompositStatk(0,hist[0]);
        //stack.push(top);
        int i=0;
        for(i=0;i<len;i++){
            CompositStatk newElement = new CompositStatk(i,hist[i]);
            while(!stack.isEmpty()){
                if(newElement.getHeight() < stack.peek().getHeight()){
                    top = stack.pop();
                }else{
                    break;
                }
            }
            if(stack.isEmpty()){
                stack.push(new CompositStatk(0,newElement.getHeight()));
            }else{
                stack.push(newElement);
            }
            System.out.println(stack);
        }
        System.out.println("-----------------");
//        while (!stack.isEmpty()){
//
//        }

        return max;
    }

    public void print(int []arr){
        System.out.println();
        for (int ele:arr) {
            System.out.print("\t"+ele);
        }
    }

    private int[] smallestToLeft(int[] hist) {
        int len = hist.length;
        int stl[] = new int[len];
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<len;i++){
            while(!s.isEmpty() && hist[s.peek()]<=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                stl[i] = -1;
            }else{
                stl[i] = i-1;
            }
            s.push(i);
        }

        return stl;
    }

    private int[] smallestToRight(int[] hist) {
        int len  = hist.length;
        int str[] = new int[len];
        Stack<Integer> s = new Stack<>();

        for(int i=len-1;i>=0;i--){
            while(!s.isEmpty() && hist[i]<=s.peek()){
                s.pop();
            }
            if(s.isEmpty()){
                str[i] = len;
            }else{
                str[i] = i+1;
            }
            s.push(hist[i]);
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(new MaxAreaHistogramMain().largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
}


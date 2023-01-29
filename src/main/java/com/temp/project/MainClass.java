package com.temp.project;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MainClass {

    Map<Character,List<Character>> map = new HashMap();
    List<String> master = new LinkedList();

    public static void main(String[] args) {
        //System.out.println("Hello world!");
        //System.out.println(factorial(3));
        new MainClass().go("2345");
    }

    private void go(String digits) {

        this.init();
        List<List<Character>> stack = new LinkedList();
        for(int i=0;i<digits.length();i++){
            stack.add(map.get(digits.charAt(i)));
        }

        List<Character> first = stack.remove(0);

        pairup(first, stack);



    }

    public List<String> pairup(List<Character> first, List<List<Character>> stack){
        List<Character> second = null;
        if(stack.size()>1){
            pairup(stack.remove(0),stack);
        }else{
            second = stack.get(0);
        }
        for(Character c : first){
            if(null!=second){
                for(Character c1 : second){
                    master.add(c+" "+c1);
                }
            }else{
                List<String> tmaster = new LinkedList();
                for(String s : master){
                    String temp = s;
                    temp = c+" "+s;
//                    master.remove(s);
                    tmaster.add(temp);
                }
                master = tmaster;
            }

        }
        System.out.println(master);
        return null;
    }


    public void init(){
        List<Character> lc2 = new LinkedList();
        lc2.add('a');
        lc2.add('b');
        lc2.add('c');
        map.put('2',lc2);

        lc2 = new LinkedList();
        lc2.add('d');
        lc2.add('e');
        lc2.add('f');
        map.put('3',lc2);

        lc2 = new LinkedList();
        lc2.add('g');
        lc2.add('h');
        lc2.add('i');
        map.put('4',lc2);

        lc2 = new LinkedList();
        lc2.add('j');
        lc2.add('k');
        lc2.add('l');
        map.put('5',lc2);

        lc2 = new LinkedList();
        lc2.add('m');
        lc2.add('n');
        lc2.add('o');
        map.put('6',lc2);

        lc2 = new LinkedList();
        lc2.add('p');
        lc2.add('q');
        lc2.add('r');
        lc2.add('s');
        map.put('7',lc2);

        lc2 = new LinkedList();
        lc2.add('t');
        lc2.add('u');
        lc2.add('v');
        map.put('8',lc2);

        lc2 = new LinkedList();
        lc2.add('w');
        lc2.add('x');
        lc2.add('y');
        lc2.add('z');
        map.put('9',lc2);
    }

    private static int factorial(int i) {
        if(i>0){
            return  i * factorial(i-1);
        }
        return 1;
    }
}

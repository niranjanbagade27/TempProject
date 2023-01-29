package com.temp.project.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain implements Cloneable{

    private List<String> list  =  new ArrayList<>();

    public void loadData(){
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
    }

    public PrototypeMain(){

    }

    @Override
    public String toString() {
        return "PrototypeMain{" +
                "list=" + list +
                '}';
    }

    public PrototypeMain(List<String> l){
        this.list = l;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        PrototypeMain p1 = new PrototypeMain();
        p1.loadData();
        System.out.println(p1);

        PrototypeMain p2 = (PrototypeMain) p1.clone();
        System.out.println(p2);
        p2.list.remove("A");
        p2.list.add("Z");

        System.out.println(p1);
        System.out.println(p2);

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> t = new ArrayList<>();

        for(String str : this.list)
            t.add(str);

        return new PrototypeMain(t);
    }
}

package com.temp.project.designpatterns.singleton;

public class Singleton {

    private static Singleton obj;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(obj==null){
            obj = new Singleton();
            return obj;
        }
        return obj;
    }

}

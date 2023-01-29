package com.temp.project.designpatterns.template;

public abstract class ComputerManifacturer {
    //template method
    public String buildComputer(){
        String s = addRAM();
        s+=addKeyboard();
        return s;
    }
    public abstract String addRAM();
    public abstract String addKeyboard();
}

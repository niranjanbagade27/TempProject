package com.temp.project.designpatterns.template;

public class TemplateMain {
    public static void main(String[] args) {
        ComputerManifacturer cf = new DesktopManifacturer();
        System.out.println(cf.buildComputer());

        ComputerManifacturer cf1 = new LaptopManifacturer();
        System.out.println(cf1.buildComputer());
    }
}

package com.temp.project.designpatterns.template;

public class LaptopManifacturer extends ComputerManifacturer{
    @Override
    public String addRAM() {
        return "Adding ram to the laptop";
    }

    @Override
    public String addKeyboard() {
        return " Adding built-in keyboard to the laptop";
    }
}

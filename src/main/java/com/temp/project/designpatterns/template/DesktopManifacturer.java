package com.temp.project.designpatterns.template;

public class DesktopManifacturer extends ComputerManifacturer{
    @Override
    public String addRAM() {
        return "Adding ram to the desktop";
    }

    @Override
    public String addKeyboard() {
        return " Adding wired keyboard to the desktop";
    }
}

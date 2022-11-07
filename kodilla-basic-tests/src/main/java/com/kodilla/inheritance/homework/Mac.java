package com.kodilla.inheritance.homework;

public class Mac extends OperatingSystem {
    public Mac() {
        super();
        System.out.println("Mac constructor");
    }

    @Override
    public void turnOff() {
        System.out.println("Turn off operating system now.");
    }
}
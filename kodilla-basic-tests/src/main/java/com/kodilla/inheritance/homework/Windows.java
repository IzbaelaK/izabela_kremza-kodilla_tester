package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    public Windows() {
        super();
        System.out.println("Windows constructor");
    }
    @Override
    public void turnOn() {
        System.out.println("Turn on operating system now");
    }
}


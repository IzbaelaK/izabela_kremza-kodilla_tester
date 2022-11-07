package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int yearOfRelease = 2020;

    public OperatingSystem (int yearOfRealese) {
        this.yearOfRelease = yearOfRealese;
    }
    public OperatingSystem() {
        System.out.println("OperatingSystem Constructor");
    }

    public int getYearOfRelease() {
        return yearOfRelease; }

    public void turnOn() {
        System.out.println("Turn on operating system.");
    }

    public void turnOff() {
        System.out.println("Turn off operating system.");

    }

    public void Windows() {
        System.out.println("Windows constructor");
}
}

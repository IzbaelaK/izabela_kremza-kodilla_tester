package com.kodilla.inheritance.homework;

public class RunOperatingSystem {
    public static void main (String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.getYearOfRelease();

        Windows windows = new Windows();
        windows.turnOn();

        Mac mac = new Mac();
        mac.turnOff();

    }
}

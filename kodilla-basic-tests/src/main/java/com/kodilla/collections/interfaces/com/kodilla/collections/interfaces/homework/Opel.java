package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int increaseSpeed;
    int decreaseSpeed ;
    int speedOpel;

    public Opel (int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;

    }

    public Opel(double a) {
    }

    public int doRace () {
        return (3 * increaseSpeed) + (2 * decreaseSpeed) + getSpeed();

    }

    @Override
    public int getSpeed() {

        return 0;
    }

    @Override
    public void increaseSpeed() {
        int increaseSpeed = 5;
        for (int i = 0; i < speedOpel; i++){
            increaseSpeed ++;
            increaseSpeed =+ speedOpel;
        }
        System.out.println("The Opel accelerates to speed: " + increaseSpeed + "km/h");

    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 5;
        for (int i = 0; i < speedOpel; i++){
            decreaseSpeed --;
            decreaseSpeed =+ speedOpel;
        }
        System.out.println("The Opel accelerates to speed: " + decreaseSpeed + "km/h");

    }
}

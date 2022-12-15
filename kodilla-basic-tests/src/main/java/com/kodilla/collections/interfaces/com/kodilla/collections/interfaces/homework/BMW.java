package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class BMW implements Car {
    int increaseSpeed;
    int decreaseSpeed;
    int speedBMW;

    public BMW (int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;

    }

    public BMW(double a) {
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
        for (int i = 0; i < speedBMW; i++){
            increaseSpeed ++;
            increaseSpeed =+ speedBMW;
        }
        System.out.println("The BMW accelerates to speed: " + increaseSpeed + "km/h");
    }
    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 5;
        for (int i = 0; i < speedBMW; i++){
            decreaseSpeed --;
            decreaseSpeed =+ speedBMW;
        }
        System.out.println("The BMW accelerates to speed: " + decreaseSpeed + "km/h");

    }
}

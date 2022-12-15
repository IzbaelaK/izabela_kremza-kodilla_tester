package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int increaseSpeed;
    int decreaseSpeed;
    int speedFord;



    public Ford(int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;

    }

    public Ford(double a) {
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
        for (int i = 0; i < speedFord; i++){
            increaseSpeed ++;
            increaseSpeed =+ speedFord;
        }
        System.out.println("The BMW accelerates to speed: " + increaseSpeed + "km/h");

    }

    @Override
    public void decreaseSpeed() {
        int decreaseSpeed = 5;
        for (int i = 0; i < speedFord; i++){
            decreaseSpeed --;
            decreaseSpeed =+ speedFord;
        }
        System.out.println("The BMW accelerates to speed: " + decreaseSpeed + "km/h");

    }


}

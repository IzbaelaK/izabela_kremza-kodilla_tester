package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    int increaseSpeed = 15;
    int decreaseSpeed = 25;

    public Opel (int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;

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
    }

    @Override
    public void decreaseSpeed() {
    }
}

package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int a = 5;
    private int b = 6;
    private int c = 7;
    private int h = 4;

    public Shape(int a, int b, int c, int h) {
        this.a = 5;
        this.b = 6;
        this.c = 7;
        this.h = 4;
    }

    public abstract void getSurfaceArea();
    public abstract void getCircuit();
}



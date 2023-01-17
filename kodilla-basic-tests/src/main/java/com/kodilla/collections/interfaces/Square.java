package com.kodilla.collections.interfaces;

import java.util.Objects;

public class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    public double getPerimeter() {
        return 4 * width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                '}';
    }
}

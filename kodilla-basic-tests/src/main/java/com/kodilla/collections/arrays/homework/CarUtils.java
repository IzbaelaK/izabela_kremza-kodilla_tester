package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car name: "+ getCarName(car));
        System.out.println("Car increaseSpeed: " + car.getSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof BMW)
            return "BMW";
        else
            return "Unknown car name";
    }

    public static void increaseSpeed(Car car) {
    }
}





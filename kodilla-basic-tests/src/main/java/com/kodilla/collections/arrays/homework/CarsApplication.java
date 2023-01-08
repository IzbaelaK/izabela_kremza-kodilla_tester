package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;


public class CarsApplication {
    private static final Random random = new Random();
    int drawCar = random.nextInt(3);

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawCar = random.nextInt(3);
        double a = getRandomSpeed(random) * 100 + 1;

        if (drawCar == 0)
            return new Ford(a);
        else if (drawCar == 1)
            return new Opel(a);
        else {
            double b = getRandomSpeed(random);
            double c = getRandomSpeed(random);
            return new BMW(a);
        }
    }

    private static double getRandomSpeed(Random random) {
        return random.nextDouble() * 100 + 1;
    }

}


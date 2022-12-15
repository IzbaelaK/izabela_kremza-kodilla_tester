package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;


public class CarsListApplication {
        public static void main(String[] args) {
            List<Car> cars = new ArrayList<>();
            Ford ford = new Ford (10.0);
            cars.add(ford);
            cars.add(new Opel(15));
            cars.add(new BMW(20));

            cars.remove(1);
            cars.remove(ford);

            System.out.println(cars.size());
            for (Car Opel : cars) {
                System.out.println(Opel + ", increaseSpeed: " + Opel.getSpeed());
                for (Car Ford : cars) {
                System.out.println(Opel + ", increaseSpeed: " + Ford.getSpeed());
                for (Car BMW : cars)
                System.out.println(Opel + ", increaseSpeed: " + BMW.getSpeed());
            }
                System.out.println(cars.size());
            }

            }


}

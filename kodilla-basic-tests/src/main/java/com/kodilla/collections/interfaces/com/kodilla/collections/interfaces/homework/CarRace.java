package com.kodilla.collections.interfaces.com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main (String[] args) {
        Ford ford = new Ford(10, 20);
        System.out.println(ford.increaseSpeed);
        System.out.println(ford.decreaseSpeed);
        System.out.println(ford.doRace());
        System.out.println();

        Opel opel = new Opel(15, 25);
        System.out.println(opel.increaseSpeed);
        System.out.println(opel.decreaseSpeed);
        System.out.println(opel.doRace());
        System.out.println();

        BMW bmw = new BMW(20, 30);
        System.out.println(bmw.increaseSpeed);
        System.out.println(bmw.decreaseSpeed);
        System.out.println(bmw.doRace());
        System.out.println();
    }

}

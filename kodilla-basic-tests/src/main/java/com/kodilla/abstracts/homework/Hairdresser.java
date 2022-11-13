package com.kodilla.abstracts.homework;

public class Hairdresser extends Job {

    public Hairdresser(int salary, String responsibilities) {
        super(4000, "hairCut, hairWash");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Responsibilities of a Hairdresser are: hairCut, hairWash");
    }

    @Override
    public void getSalary() {
        System.out.println("The Hairdresser earns: 4000 zł");
    }

    @Override
    public void getpersonsDetails() {
        System.out.println("Grażyna has a duty at work: hairCut, hairWash");

    }

}

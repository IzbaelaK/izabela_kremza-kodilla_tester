package com.kodilla.abstracts.homework;

public class Doctor extends Job {

    public Doctor(int salary, String responsibilities) {
        super(5000, "toTreat, explores");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Responsibilities of a Teacher: toTreat, explores");
    }

    @Override
    public void getSalary() {
        System.out.println("The Doctor earns: 5000 zł");
    }

    @Override
    public void getpersonsDetails() {
        System.out.println("Jolanta has a duty at work: toTreat, explores");
    }
}

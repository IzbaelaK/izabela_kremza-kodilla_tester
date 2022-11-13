package com.kodilla.abstracts.homework;

public class Teacher extends Job {
    public Teacher(int salary, String responsibilities) {
        super(3000, "teach, bringUp");

    }

    @Override
    public void getResponsibilities() {
        System.out.println("Responsibilities of a Teacher: teach, bringUp");
    }

    @Override
    public void getSalary() {
        System.out.println("The Teacher earns: 3000 zł");
    }

    @Override
    public void getpersonsDetails() {
        System.out.println("Halina has a duty at work: teach, bringUp");

    }
}

package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;


    public Person(String firstName, int age, Job job) {
        super();
    }


    public static void main(String[] args) {
        new Person("Jolanta", 35, new Doctor(5000, "toTreat, explores"));
        new Person("Grażyna", 28, new Hairdresser(4000, "hairCut, hairWash"));
        new Person("Halina", 25, new Teacher(3000, "teach, bringUp"));


        Hairdresser hairdresser = new Hairdresser(4000, "hairCut, hairWash");
        hairdresser.getResponsibilities();
        hairdresser.getpersonsDetails();

        Teacher teacher = new Teacher(3000, "teach, bringUp");
        teacher.getResponsibilities();
        teacher.getpersonsDetails();

        Doctor doctor = new Doctor(5000, "toTreat, explores");
        doctor.getResponsibilities();
        doctor.getpersonsDetails();

    }
    }
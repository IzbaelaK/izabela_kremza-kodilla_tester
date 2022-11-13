package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private String job;


    public Person(String firstName, int age, String job) {
        super();
    }


    public static void main(String[] args) {
        Person jolanta = new Person("Jolanta", 35, "Doctor");
        Person grażyna = new Person("Grażyna", 28, "Hairdresser");
        Person halina = new Person("Halina", 25, "Teacher");

        Person[] persons = {jolanta, grażyna, halina};


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
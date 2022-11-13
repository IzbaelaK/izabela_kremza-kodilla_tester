package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities) {
    this.salary = salary;
    this.responsibilities = responsibilities;
    }

    public Job(String firstName, int age, String job) {

    }

    public abstract void getResponsibilities();
    public abstract void getSalary();

    public abstract void getpersonsDetails();
}
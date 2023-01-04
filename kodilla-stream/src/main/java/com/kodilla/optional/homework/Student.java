package com.kodilla.optional.homework;

public class Student {
    public String name;
    Teacher teacher;

    Teacher teachers = new Teacher ("Elwira Moskal");

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                ", teachers=" + teachers +
                '}';
    }
}

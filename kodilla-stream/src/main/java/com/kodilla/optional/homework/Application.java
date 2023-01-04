package com.kodilla.optional.homework;

import stream.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
            List<Student> students = new ArrayList<>();
            List<Teacher> teachers = new ArrayList<>();
            students.add(new Student("Jan Kowslski", new Teacher ("Elwira Moskal")));
            students.add(new Student("Katarzyna Piorun", new Teacher(null)));
            students.add(new Student("Jolanta Szpak", new Teacher (null)));
            students.add(new Student("Maria Kucharska", new Teacher ("Bogusław Rząsa")));
            students.add(new Student("Grzegorz Nowak", new Teacher ("Wojciech Adamczyk")));
        System.out.println(students);


        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher);

    }

}



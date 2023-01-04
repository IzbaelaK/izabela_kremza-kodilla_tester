package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowslski", "Elwira Moskal"));
        students.add(new Student("Katarzyna Piorun", null));
        students.add(new Student("Jolanta Szpak", null));
        students.add(new Student("Maria Kucharska", "Bogusław Rząsa"));
        students.add(new Student("Grzegorz Nowak", "Wojciech Adamczyk"));

        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());

            System.out.println("uczeń: " + student.getName() + ", " + "nauczyciel: " + student.getTeacher());
        }
    }
}



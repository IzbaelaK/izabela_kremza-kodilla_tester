package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowslski", new Teacher ("Elwira Moskal")));
        students.add(new Student("Katarzyna Piorun", null));
        students.add(new Student("Jolanta Szpak",  null));
        students.add(new Student("Maria Kucharska", new Teacher ("Bogusław Rząsa")));
        students.add(new Student("Grzegorz Nowak", new Teacher ("Wojciech Adamczyk")));

        String teacher = null;
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
               String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();

            System.out.println("Uczeń: " + student.getName() + ", " + "nauczyciel: " + name);
        }
    }
}



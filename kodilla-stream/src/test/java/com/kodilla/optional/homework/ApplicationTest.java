package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import stream.UsersManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    @Test
    public void StudentsAndTheirTeachers() {
        //when
        List<Student> students = new ArrayList<>();
          String teacher = null;
        for (Student student : students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            //then
            students.add(new Student("Jan Kowslski", new Teacher ("Elwira Moskal")));
            students.add(new Student("Katarzyna Piorun", null));
            students.add(new Student("Jolanta Szpak", null));
            students.add(new Student("Maria Kucharska", new Teacher ("Bogusław Rząsa")));
            students.add(new Student("Grzegorz Nowak", new Teacher ("Wojciech Adamczyk")));

            System.out.println("Uczeń: " + student.getName() + ", " + "nauczyciel: " + name);
        }
    }
}
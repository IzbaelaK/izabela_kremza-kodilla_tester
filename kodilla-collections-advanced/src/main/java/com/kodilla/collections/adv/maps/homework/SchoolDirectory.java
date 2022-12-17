package com.kodilla.collections.adv.maps.homework;

import complex.Grades;
import complex.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();
        Principal JanKowalski = new Principal("Jan Kowalski", "Szkoła Podstawowa numer 3");
        Principal ZofiaNowak = new Principal("Zofia Nowak", "Szkoła Podstawowa numer 5");
        Principal StefanRak = new Principal("Stefan Rak", "Szkoła podstawowa numer 2");

        School JanKowalskiSchool = new School(Arrays.asList(25, 26, 27, 28));
        School ZofiaNowakSchool = new School(Arrays.asList(30, 29, 28, 27));
        School StefanRakSchool = new School(Arrays.asList(21, 22, 23, 24));

        school.put(JanKowalski, JanKowalskiSchool);
        school.put(ZofiaNowak, ZofiaNowakSchool);
        school.put(StefanRak, StefanRakSchool);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet()) {
            System.out.println("Principal: " + principalEntry.getKey().getNamePrincipal() + ", " + "Nazwa szkoły: " + principalEntry.getKey().getNameSchool() + ", " + "Liczba uczniów w szkole: " + principalEntry.getValue().getSum());
        }
    }

}

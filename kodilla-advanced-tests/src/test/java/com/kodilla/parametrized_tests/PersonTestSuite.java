package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource ("com.kodilla.parametrized_tests.PersonSources#sourcesForCalculatingBMI")
    public void shouldCalculateBMI(double height, double weight, String message) {
        Person person = new Person(height, weight);
        assertEquals(message, person.getBMI());
    }

}

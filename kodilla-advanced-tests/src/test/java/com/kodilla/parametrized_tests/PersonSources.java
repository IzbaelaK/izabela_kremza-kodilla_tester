package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> sourcesForCalculatingBMI() {
        return Stream.of(
                Arguments.of( 1.70, 60.00, "Normal (healthy weight)"),
                Arguments.of(1.85, 96.5, "Overweight"),
                Arguments.of(1.57, 58, "Normal (healthy weight)")
        );

    }
}

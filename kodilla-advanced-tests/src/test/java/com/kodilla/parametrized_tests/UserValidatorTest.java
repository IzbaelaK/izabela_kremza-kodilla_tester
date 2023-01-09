package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {
    private UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"gruszkapietruszka2603", "janusz.kowal321", "ola_fasola997"})
    public void shouldReturnTrueIfTheUsernameIsValid(String username) {
        boolean result = validator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"gruszkapietruszka#3", "j@nuszkow@l", "ola&fasola"})
    public void shouldReturnFalseIfTheUsernameIsValid(String username) {
        boolean result = validator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"joanna.nowak@.pl", "spokoloko@e-mail", "lolo.gmail.com"})
    public void shouldReturnFalseIfTheEmailIsValid(String email) {
        boolean result = validator.validateEmail(email);
        assertFalse(result);
    }
    @ParameterizedTest
    @ValueSource(strings = {"joanna.nowak@onet.pl", "spoko_loko@op.pl", "lolo@gmail.com"})
    public void shouldReturnTrueIfTheEmailIsValid(String email) {
        boolean result = validator.validateEmail(email);
        assertTrue(result);
    }
}

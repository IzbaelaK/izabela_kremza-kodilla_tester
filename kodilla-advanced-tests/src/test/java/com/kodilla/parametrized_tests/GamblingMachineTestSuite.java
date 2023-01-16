package com.kodilla.parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;


public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/correctNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins(String one, String two, String three, String four, String five, String six) throws InvalidNumbersException {
        //given
        Set<Integer> userNumbers  = new HashSet<Integer>(Set.of(
                Integer.parseInt(one),
                Integer.parseInt(two),
                Integer.parseInt(three),
                Integer.parseInt(four),
                Integer.parseInt(five),
                Integer.parseInt(six)));
        GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
        gamblingMachine.howManyWins(userNumbers);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbersWithCommas.csv", numLinesToSkip = 1)
    public void testHowManyWins1withException(String one, String two, String three, String four, String five, String six) throws InvalidNumbersException {
        //given
        Set<Integer> userNumbers1 = new HashSet<Integer>(Set.of(
                Integer.parseInt(one),
                Integer.parseInt(two),
                Integer.parseInt(three),
                Integer.parseInt(four),
                Integer.parseInt(five),
                Integer.parseInt(six)));
        GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
       assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers1));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 1)
    public void testHowManyWins_withException(String line1) {
    //given
    Set<Integer> userNumbers2 = new HashSet<Integer>();
    String[] numbers1 = line1.split(" ");
    for (String n : numbers1)
        userNumbers2.add(Integer.parseInt(n));
    GamblingMachine gamblingMachine = new GamblingMachine();
        //when
        //then
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbers2));
}
}

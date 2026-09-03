package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void lionShouldHaveCorrectMane(String sex, boolean expected) throws Exception {
        Feline feline = new Feline();

        Lion lion = new Lion(sex, feline);

        assertEquals(expected, lion.doesHaveMane());
    }


}
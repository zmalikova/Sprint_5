package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineParameterizedTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 10})
    public void getKittensShouldReturnSpecifiedNumber(int kittensCount) {
        Feline feline = new Feline();

        assertEquals(
                kittensCount,
                feline.getKittens(kittensCount)
        );
    }
}

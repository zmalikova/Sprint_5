package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlexTest {

    @Test
    public void getFriendsShouldReturnFriends() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Alex alex = new Alex(feline);

        List<String> expected = List.of(
                "Марти",
                "Глория",
                "Мелман"
        );

        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingShouldReturnNewYorkZoo() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Alex alex = new Alex(feline);

        assertEquals(
                "Нью-Йоркский зоопарк",
                alex.getPlaceOfLiving()
        );
    }

    @Test
    public void getKittensShouldReturnZero() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Alex alex = new Alex(feline);

        assertEquals(0, alex.getKittens());
    }

    @Test
    public void alexShouldHaveMane() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        Alex alex = new Alex(feline);

        assertTrue(alex.doesHaveMane());
    }
}

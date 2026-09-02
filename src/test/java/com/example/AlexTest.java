package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlexTest {

    @Test
    public void getFriendsShouldReturnFriends() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        Alex alex = new Alex(predator);

        List<String> expected = List.of(
                "Марти",
                "Глория",
                "Мелман"
        );

        assertEquals(expected, alex.getFriends());
    }

    @Test
    public void getPlaceOfLivingShouldReturnNewYorkZoo() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        Alex alex = new Alex(predator);

        assertEquals(
                "Нью-Йоркский зоопарк",
                alex.getPlaceOfLiving()
        );
    }

    @Test
    public void getKittensShouldReturnZero() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        Alex alex = new Alex(predator);

        assertEquals(0, alex.getKittens());
    }
}

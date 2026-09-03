package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatShouldReturnPredatorFood() throws Exception {
        Feline feline = new Feline();

        List<String> expected = List.of(
                "Животные",
                "Птицы",
                "Рыба"
        );

        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyShouldReturnCats() {
        Feline feline = new Feline();

        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensShouldReturnOne() {
        Feline feline = new Feline();

        assertEquals(1, feline.getKittens());
    }
}

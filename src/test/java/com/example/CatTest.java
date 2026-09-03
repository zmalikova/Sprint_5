package com.example;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CatTest {

    @Test
    public void getSoundShouldReturnMeow() {
        Predator predator = mock(Predator.class);

        Cat cat = new Cat(predator);

        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFoodShouldReturnFoodFromPredator() throws Exception {
        Predator predator = mock(Predator.class);

        List<String> food = List.of(
                "Животные",
                "Птицы",
                "Рыба"
        );

        when(predator.eatMeat()).thenReturn(food);

        Cat cat = new Cat(predator);

        assertEquals(food, cat.getFood());
    }
}

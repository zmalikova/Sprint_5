package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LionTest {

    @Test
    public void lionShouldHaveMane() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        Lion lion = new Lion("Самец", predator);

        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void lionShouldNotHaveManeWhenFemale() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        Lion lion = new Lion("Самка", predator);

        assertFalse(lion.doesHaveMane());
    }

    @Test
    public void getKittensShouldReturnNumberFromPredator() throws Exception {
        Predator predator = Mockito.mock(Predator.class);
        Mockito.when(predator.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", predator);

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodShouldReturnFoodFromPredator() throws Exception {
        Predator predator = Mockito.mock(Predator.class);

        List<String> food = List.of(
                "Животные",
                "Птицы",
                "Рыба"
        );

        Mockito.when(predator.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", predator);

        assertEquals(food, lion.getFood());
    }

    @Test
    public void constructorShouldThrowExceptionForInvalidSex() {
        Predator predator = Mockito.mock(Predator.class);

        assertThrows(
                Exception.class,
                () -> new Lion("Неизвестно", predator)
        );
    }
}

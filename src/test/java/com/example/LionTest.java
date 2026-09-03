package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LionTest {

    @Test
    public void getKittensShouldReturnNumberFromFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);
        Mockito.when(feline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", feline);

        assertEquals(3, lion.getKittens());
    }

    @Test
    public void getFoodShouldReturnFoodFromFeline() throws Exception {
        Feline feline = Mockito.mock(Feline.class);

        List<String> food = List.of(
                "Животные",
                "Птицы",
                "Рыба"
        );

        Mockito.when(feline.eatMeat()).thenReturn(food);

        Lion lion = new Lion("Самец", feline);

        assertEquals(food, lion.getFood());
    }

    @Test
    public void constructorShouldThrowExceptionForInvalidSex() {
        Feline feline = Mockito.mock(Feline.class);

        assertThrows(
                Exception.class,
                () -> new Lion("Неизвестно", feline)
        );
    }
}

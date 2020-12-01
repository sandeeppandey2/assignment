package com.example.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DisplayNumberServiceTests {

    @InjectMocks
    DisplayNumberService displayNumberService;

    @Test
    public void testDisplayNumbersHappyFlow() {
        List<Integer> numbers = displayNumberService.getNumbers(10);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), numbers);
    }

    @Test
    public void testDisplayNumbersUnHappyFlow() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            displayNumberService.getNumbers(-10);
        });
    }

}

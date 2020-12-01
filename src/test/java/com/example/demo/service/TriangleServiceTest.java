package com.example.demo.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class TriangleServiceTest {

    @InjectMocks
    TraingleService traingleService;

    @Test
    public void testAreaOfTriangle() {
        assertEquals(10.0, traingleService.getAreaOfTriangle(4, 5));

    }
}

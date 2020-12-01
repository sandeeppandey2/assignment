package com.example.demo.service;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*Service class to display numbers*/
@Component
public class DisplayNumberService {

    public List<Integer> getNumbers(int limit) throws IllegalArgumentException{
        return IntStream.iterate(1, i -> i + 1)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }

}

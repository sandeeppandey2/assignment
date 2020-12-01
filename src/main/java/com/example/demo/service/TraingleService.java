package com.example.demo.service;

import com.example.demo.model.AreaOfTriangle;
import org.springframework.stereotype.Component;

@Component
public class TraingleService {
    private AreaOfTriangle triangleArea = new AreaOfTriangle();
    public double getAreaOfTriangle(double height,double base) throws RuntimeException{

        return 0.5*(height*base);
    }

}

package com.example.demo.service;

import com.example.demo.model.AreaOfTriangle;
import org.springframework.stereotype.Component;


/*Service class to serve triangle operations*/
@Component
public class TraingleService {

    public double getAreaOfTriangle(double height,double base) throws IllegalArgumentException{
        return 0.5*(height*base);
    }

}

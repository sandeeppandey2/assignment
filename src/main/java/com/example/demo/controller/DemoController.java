package com.example.demo.controller;

import com.example.demo.model.AreaOfTriangle;
import com.example.demo.model.NumberSequence;
import com.example.demo.service.DisplayNumberService;
import com.example.demo.service.TraingleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/*Demo Controller class to serve user requests*/
@RestController
@Slf4j
@RequestMapping("/api/demo")
public class DemoController {

    @Autowired
    private TraingleService triangleService;

    @Autowired
    private DisplayNumberService displayNumbers;

    /*  Rest Method to get Area of Triangle
    * @Param input double values
    */
    @GetMapping("/areaOfTriangle/{height}/{base}")
    public ResponseEntity<Object> getAreaOftriangle(@PathVariable("height") double height, @PathVariable("base") double base) {
        AreaOfTriangle triangleArea = new AreaOfTriangle();
        try {
            triangleArea.setTriangleArea(triangleService.getAreaOfTriangle(height, base));

        } catch (IllegalArgumentException illegalArgumentException) {
            log.error("Runtime Exception Occurred" + runtimeException.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error in area of triangle method correct your input" +illegalArgumentException.getMessage());
        }

        return ResponseEntity.ok(triangleArea);

    }

    /*  Rest Method to get Sequence of numbers
    * @Param int - input parameter
    */
    @GetMapping("numberSequence/{number}")
    public ResponseEntity<Object> getNumbersInSequence(@PathVariable("number") int number) {
        NumberSequence numberSequence = new NumberSequence();
        try {
            numberSequence.setListofNumbers(displayNumbers.getNumbers(number));
        } catch (IllegalArgumentException illegalArgumentException) {
            log.error("Entered number is not an integer" + illegalArgumentException.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Entered number is not and integer" + illegalArgumentException.getMessage());
        }
        return ResponseEntity.ok(numberSequence);
    }
}



package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoControllerTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getNumberSequence(){
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/demo/numberSequence/5",
                String.class)).contains("[1,2,3,4,5]");
    }


    @Test
    public void areOfTriangle(){
        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/demo/areaOfTriangle/5/4",
                String.class)).contains("10.0");
    }

}

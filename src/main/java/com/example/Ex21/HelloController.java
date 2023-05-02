package com.example.Ex21;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${authCode}")
    private String authCode;
    @Value("${devName}")
    private String devName;

    @GetMapping("/hello")
    public String sayHello(){

        return "Hello " + devName + "  " + " AuthCode is: " + authCode;



    }


}

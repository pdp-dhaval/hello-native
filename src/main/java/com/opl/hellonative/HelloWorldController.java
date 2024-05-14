package com.opl.hellonative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-native")
    public String hello(){
        return "Hello World! from native";
    }
}

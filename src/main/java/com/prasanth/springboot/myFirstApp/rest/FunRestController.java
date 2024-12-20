package com.prasanth.springboot.myFirstApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // expose "/" to return "Hello, World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello world!";
    }
}

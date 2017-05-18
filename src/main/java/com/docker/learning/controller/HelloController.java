package com.docker.learning.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/home")
    public String home() {
        return "Hello!!! Welcome To Docker World";
    }
}

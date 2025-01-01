package com.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllet {

    @GetMapping("/home")
    public String f1(){
        return "This is home page";
    }

    @GetMapping("/test")
    public String f2(){
        return "This is testing page";
    }

}

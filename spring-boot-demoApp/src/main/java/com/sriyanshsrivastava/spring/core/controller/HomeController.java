package com.sriyanshsrivastava.spring.core.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "This is home. welcome to the world of api !!!";
    }
}

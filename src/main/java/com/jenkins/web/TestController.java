package com.jenkins.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public void hello(){
        System.out.println("hello");
    }
}

package com.jenkins.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @Getapping({"", "/"})
    public String hello(){


        return "/hello";
    }
}

package com.java.cube.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testcontroller {

    @GetMapping("")
    public String showHomePage(){
        return "index";

    }
}

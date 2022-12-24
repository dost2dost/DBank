package com.DBank.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DBankController {
    @GetMapping("/hello")
    public String test(){
        return "success full aa";

    }
}

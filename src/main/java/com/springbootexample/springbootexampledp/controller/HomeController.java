package com.springbootexample.springbootexampledp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {

    @GetMapping("/signUp")
    public String signUp() {

        return "signUp";
    }
}

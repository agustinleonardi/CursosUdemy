package com.agustin.curso.springboot.webapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @GetMapping("/details")
    public String details(){
        return "details";
    }
}

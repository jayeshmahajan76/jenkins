package com.example.jenkinsnew.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    UserController(){

    }

    @GetMapping("/list")
    public String getList(){
        return "Hii Jayesh 2" ;
    }

}

package com.example.multipledatabaseapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BaseController {

    @GetMapping("")
    public String index() {
        return "index ''";
    }

//    @GetMapping("/")
//    public String index2() {
//        return "index2 '/'";
//    }
//
    @GetMapping("/")
    public String index2() {
        throw new ClassCastException("");
//        return "index2 '/'";
    }



}

package com.medkhelifi.tutorials.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class IndexController {

    @RequestMapping(value = "" )
    public String index (){
        return "Hello spring webmvc annotation config";
    }
}

package com.optimartnetcom.message;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/message")
    public String display(){
        return "Welcome to test heroku server";
    }
}

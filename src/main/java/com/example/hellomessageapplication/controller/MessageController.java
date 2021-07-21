package com.example.hellomessageapplication.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/msg")
public class MessageController {

    @RequestMapping(value = {"/home"})
    public String helloMessage() {
        return "Hello From BridgeLabz !";
    }
}

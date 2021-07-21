package com.example.hellomessageapplication.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/msg")
public class MessageController {

    @RequestMapping(value = {"/home"})
    public String helloMessage() {
        return "Hello From BridgeLabz !";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloMark(@RequestParam(value="name")String name) {
        return "Hello " + name + " !!";
    }
}

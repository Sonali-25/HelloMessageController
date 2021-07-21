package com.example.hellomessageapplication.controller;


import com.example.hellomessageapplication.component.User;
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

    @GetMapping ("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + " !!";
    }

    @PostMapping ("/post")
    public String sayHello(@RequestBody User user) {
        return "  Hello " + user.getFirstName() + " "+ user.getLastName() +" !!";
    }
}

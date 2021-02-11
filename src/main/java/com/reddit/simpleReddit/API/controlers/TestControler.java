package com.reddit.simpleReddit.API.controlers;

import com.reddit.simpleReddit.API.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControler {
    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }



}

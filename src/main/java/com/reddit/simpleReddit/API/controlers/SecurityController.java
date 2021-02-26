package com.reddit.simpleReddit.API.controlers;

import com.reddit.simpleReddit.API.models.User;
import com.reddit.simpleReddit.API.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public String register(@RequestBody User user){
        return userService.register(user);
    }
   /* @GetMapping("/login")
    public void login(@RequestBody UsernameAndPasswordAuthenticationRequest user){
       System.out.println(user.getUsername());
    }*/
}

package com.tweeteroo.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    
    @PostMapping    
    public  String create(@RequestBody String body){
        System.out.println(body);
        return body;
    }
}



   

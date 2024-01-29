package com.tweeteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/tweets")
public class TweetController {

    @PostMapping    
    public  String create(@RequestBody String body){
        System.out.println(body);
        return body;
    }

    @GetMapping       
    public  String findAll(){
        return "Algum conteudo";
    }

    @GetMapping("user/{userId}")       
    public  String findById(@PathVariable Long userId){
        return "Algum conteudo" + userId;
    }
    
}

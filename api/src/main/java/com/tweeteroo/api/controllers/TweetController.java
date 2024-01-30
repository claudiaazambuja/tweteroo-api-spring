package com.tweeteroo.api.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeteroo.api.repositories.TweetRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/tweets")
public class TweetController {
    final TweetRepository tweetRepository;

    TweetRepository(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    @PostMapping    
    public  String create(@RequestBody String body){
        System.out.println(body);
        return body;
    }

    @GetMapping       
    public  List<TweetModel> findAll(){
        return tweetRepository.findAll()
    }

    @GetMapping("user/{userId}")       
    public  String findById(@PathVariable Long userId){
        return "Algum conteudo" + userId;
    }
    
}

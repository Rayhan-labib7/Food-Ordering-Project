package com.labib.online_food_ordering.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public ResponseEntity<String>getHomeMessage(){
        return new ResponseEntity<>("wellcome to food",HttpStatus.OK);
    }
}

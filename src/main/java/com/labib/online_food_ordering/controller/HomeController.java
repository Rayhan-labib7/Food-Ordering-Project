package com.labib.online_food_ordering.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> getHomeMessage() {
        // Log statement to confirm the method is being called
        System.out.println("HomeController: getHomeMessage() called");
        return new ResponseEntity<>("welcome to food", HttpStatus.OK);
    }

    @GetMapping("/test")
    public ResponseEntity<String> testEndpoint() {
        System.out.println("HomeController: testEndpoint() called");
        return new ResponseEntity<>("Test endpoint working", HttpStatus.OK);
    }
}

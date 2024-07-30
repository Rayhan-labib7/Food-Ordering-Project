package com.labib.online_food_ordering.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SuccessController {
@GetMapping("/success")
public String success(){
    return "success";
}
}

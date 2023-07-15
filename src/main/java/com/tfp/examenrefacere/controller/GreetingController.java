package com.tfp.examenrefacere.controller;

import com.tfp.examenrefacere.entity.GreetingEntity;
import com.tfp.examenrefacere.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/greeting/add, ")
    public String addGreeting(@ModelAttribute GreetingEntity greetingEntity){
        return greetingService.addGreeting(greetingEntity);
    }


}

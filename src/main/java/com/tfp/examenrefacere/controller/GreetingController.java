package com.tfp.examenrefacere.controller;

import com.tfp.examenrefacere.entity.GreetingEntity;
import com.tfp.examenrefacere.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class GreetingController {

    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @PostMapping("/greeting/add")
    public String addGreeting(@ModelAttribute GreetingEntity greetingEntity){
        return greetingService.addGreeting(greetingEntity);
    }


    @GetMapping("/greeting/getAll")
    public Object getAllGreetings(){
        return greetingService.getAllGreetings();
    }

}

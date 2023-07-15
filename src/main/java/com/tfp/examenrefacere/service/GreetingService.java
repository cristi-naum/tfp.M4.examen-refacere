package com.tfp.examenrefacere.service;


import com.tfp.examenrefacere.entity.GreetingEntity;
import com.tfp.examenrefacere.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String addGreeting(GreetingEntity greetingEntity){

        if (greetingEntity.getGreetingID() == 0)
            return "ID este null!";
        if (greetingEntity.getDescription().equals(""))
            return "Descrierea este nula!";
        if (greetingEntity.getPrice() == 0)
            return "Pretul este null!";
        if(greetingEntity.getTypeID() == 0)
            return "ID Tip este null!";
        if(greetingEntity.getCategoryID() == 0)
            return "ID Categorie este null!";

        greetingRepository.save(greetingEntity);

        return "Greeting was added!";
    }

}

package com.tfp.examenrefacere.service;


import com.tfp.examenrefacere.entity.CategoryEntity;
import com.tfp.examenrefacere.entity.GreetingEntity;
import com.tfp.examenrefacere.entity.TypeEntity;
import com.tfp.examenrefacere.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public void test()
    {
        TypeEntity typeEntity = new TypeEntity();

        CategoryEntity categoryEntity = new CategoryEntity();


    }


    public Object getAllGreetings(){

        List<Object[]> greetings;

        //List<GreetingEntity> greetings;

        greetings = greetingRepository.getAllGreetings();

        //greetings = greetingRepository.findAll();


        if (greetings.size() == 0)
            return "There are no greetings in the database!";

        return greetings;
    }

}

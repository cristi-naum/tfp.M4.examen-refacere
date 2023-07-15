package com.tfp.examenrefacere.repository;

import com.tfp.examenrefacere.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<GreetingEntity, Integer> {


}

package com.tfp.examenrefacere.repository;

import com.tfp.examenrefacere.entity.GreetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GreetingRepository extends JpaRepository<GreetingEntity, Integer> {


    @Query("SELECT g.GreetingID, g.Description, g.Price, t.TypeName, c.CategoryName FROM GreetingEntity g INNER JOIN CategoryEntity c ON g.CategoryID = c.CategoryID INNER JOIN TypeEntity t ON g.TypeID = t.TypeID")
    public List<Object[]> getAllGreetings();


}

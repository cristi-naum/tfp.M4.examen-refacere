package com.tfp.examenrefacere.repository;

import com.tfp.examenrefacere.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {
}

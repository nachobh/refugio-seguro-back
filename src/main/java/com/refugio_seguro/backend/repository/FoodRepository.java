package com.refugio_seguro.backend.repository;

import com.refugio_seguro.backend.model.Food;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.ListCrudRepository;

public interface FoodRepository extends ListCrudRepository<Food, Integer>, JpaSpecificationExecutor<Food> {
}
package com.coderscampus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.api.domain.FoodType;

public interface FoodTypeRepository extends JpaRepository<FoodType , Long>{

}

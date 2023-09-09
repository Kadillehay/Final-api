package com.coderscampus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.api.domain.Farm;

public interface FarmRepository extends JpaRepository<Farm, Long>{

}

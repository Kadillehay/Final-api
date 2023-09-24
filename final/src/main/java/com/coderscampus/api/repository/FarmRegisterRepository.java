package com.coderscampus.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coderscampus.api.domain.User;

public interface FarmRegisterRepository extends JpaRepository <User,Long>{

}

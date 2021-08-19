package com.spring.batch.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.batch.service.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}

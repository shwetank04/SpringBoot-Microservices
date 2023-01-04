package com.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.webservices.restfulwebservices.user.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}

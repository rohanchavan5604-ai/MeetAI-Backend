package com.meetai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meetai.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
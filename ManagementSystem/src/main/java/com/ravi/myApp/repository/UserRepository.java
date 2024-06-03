package com.ravi.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.myApp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

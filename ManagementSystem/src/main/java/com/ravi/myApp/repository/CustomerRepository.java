package com.ravi.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ravi.myApp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}


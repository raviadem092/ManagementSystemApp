package com.ravi.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.myApp.model.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long> {
}


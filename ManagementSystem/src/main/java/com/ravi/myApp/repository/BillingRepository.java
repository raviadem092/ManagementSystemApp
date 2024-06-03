package com.ravi.myApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.myApp.model.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {
}


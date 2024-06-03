package com.ravi.myApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.myApp.model.Billing;
import com.ravi.myApp.repository.BillingRepository;

@RestController
@RequestMapping("/billing")
public class BillingManagementController {

    private final BillingRepository billingRepository;

    @Autowired
    public BillingManagementController(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    @GetMapping
    @PreAuthorize("hasRole('ACCOUNTANT')")
    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('ACCOUNTANT')")
    public Billing addBilling(@RequestBody Billing billing) {
        return billingRepository.save(billing);
    }
}

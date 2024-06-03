package com.ravi.myApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.myApp.model.Payroll;
import com.ravi.myApp.repository.PayrollRepository;

@RestController
@RequestMapping("/payroll")
public class PayrollManagementController {

    private final PayrollRepository payrollRepository;

    @Autowired
    public PayrollManagementController(PayrollRepository payrollRepository) {
        this.payrollRepository = payrollRepository;
    }

    @GetMapping
    @PreAuthorize("hasRole('HR')")
    public List<Payroll> getAllPayrolls() {
        return payrollRepository.findAll();
    }

    @PostMapping
    @PreAuthorize("hasRole('HR')")
    public Payroll addPayroll(@RequestBody Payroll payroll) {
        return payrollRepository.save(payroll);
    }
}

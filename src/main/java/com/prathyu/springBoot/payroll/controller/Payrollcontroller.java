package com.prathyu.springBoot.payroll.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prathyu.springBoot.payroll.model.Payroll;
import com.prathyu.springBoot.payroll.service.PayrollService;

@RestController
public class Payrollcontroller {
	@Autowired
	private PayrollService service;
	
	@RequestMapping("/payrolldetails/{id}")
	public Optional<Payroll> getPayrollDetails(@PathVariable int id) {
		return service.getPayrollDetails(id);
	}
	
	@PostMapping("/addpayroll")
	public String createEmployee(@RequestBody Payroll payroll) {
		return service.createPayroll(payroll);
		
	}

}

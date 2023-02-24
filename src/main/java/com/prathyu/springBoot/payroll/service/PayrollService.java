package com.prathyu.springBoot.payroll.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.prathyu.springBoot.payroll.model.Payroll;
import com.prathyu.springBoot.payroll.repo.PayrollRepository;

@Service
public class PayrollService {
	@Autowired
	private PayrollRepository repo;
	
	public PayrollService(PayrollRepository repo) {
		// TODO Auto-generated constructor stub
		this.repo=repo;
	}

	@KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
	public void savePayroll() {
		int updatedMonthlySalary;
		
		
	}

	public Optional<Payroll> getPayrollDetails(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	public String createPayroll(Payroll payroll) {
		// TODO Auto-generated method stub
		repo.save(payroll);
		return "Payroll added..";
	}

}

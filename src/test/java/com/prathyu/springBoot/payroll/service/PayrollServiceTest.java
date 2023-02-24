package com.prathyu.springBoot.payroll.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.prathyu.springBoot.payroll.model.Payroll;
import com.prathyu.springBoot.payroll.repo.PayrollRepository;

public class PayrollServiceTest {
	private PayrollRepository repo;
	private PayrollService service;

	@BeforeEach
	void setUp() {
		repo = mock(PayrollRepository.class);
		this.service = new PayrollService(repo);
	}

	@Test
	void createPayroll() {
		Payroll payroll = new Payroll();
		payroll.setBankAccountNumber(987654321);
		payroll.setEmployeeId(6);
		payroll.setMonthlySalary(30000);
		payroll.setPayrollId(341);
		payroll.setRegisteredBank("XYZ");
		service.createPayroll(payroll);
		verify(repo).save(payroll);
	}
	
	@Test
	Optional<Payroll> getPayrollDetails(int id){
		int empId=5;
		service.getPayrollDetails(empId);
		return verify(repo).findById(empId);
	}
}

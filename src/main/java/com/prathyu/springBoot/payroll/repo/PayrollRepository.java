package com.prathyu.springBoot.payroll.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prathyu.springBoot.payroll.model.Payroll;

public interface PayrollRepository extends MongoRepository<Payroll, Integer> {

}

package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.bank.entity.Bank;



public interface BankRepository extends JpaRepository<Bank, Integer> {
	@Query(value="select ifsc_code from bank where branch=?",nativeQuery=true)
	public Integer getIfscbybranch(String branch);
	
	
}
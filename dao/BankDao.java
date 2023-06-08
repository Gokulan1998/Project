package com.example.bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bank.entity.Bank;
import com.example.bank.repository.BankRepository;


@Repository
public class BankDao {
	@Autowired
	BankRepository bankRepo;
	public String addBank(Bank b) {
		bankRepo.save(b);
		return "successfully added";
	}
	public String delBank(int id) {
		bankRepo.deleteById(id);
		return "Bank deleted Successfully";
	}
	public Bank getBank(int id) {
		return bankRepo.findById(id).get();
	}
	public List<Bank> getListBank() {
		return bankRepo.findAll();
	}
	public String updateListBank(Bank b) {
        bankRepo.save(b);
		return "employee added successfully";
	}
	public Integer getIfscbybranch(String branch) {
		
		return bankRepo.getIfscbybranch(branch);
		
	}
	public List<Bank> getAllUser() {
		return bankRepo.findAll();
		
	}

}

package com.example.bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.dao.BankDao;
import com.example.bank.entity.Bank;


@Service
public class BankService {
	@Autowired
	BankDao bankDao;

	public String addBank(Bank b) {
		return bankDao.addBank(b);
	}

	public String delBank(int id) {
		return bankDao.delBank(id);
	}
	public Bank getBank(int id) {
		return bankDao.getBank(id);
		
	}
	public List<Bank> getListBank() {
		return bankDao.getListBank();
	}
	public String updateListBank(Bank b) {
		return bankDao.updateListBank(b);
	}
	public Integer getIfscbybranch(String branch){
		return bankDao.getIfscbybranch(branch);
	}
	public List<Bank> getAllUser() {
		return bankDao.getAllUser();

	}

}

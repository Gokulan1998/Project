package com.example.bank.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Bank;
import com.example.bank.service.BankService;


@RestController

public class BankController {
	@Autowired
	BankService bankser;

	@PostMapping(value = "/AddBank")
	public String addBank(@RequestBody Bank b) {
		return bankser.addBank(b);
	}
	@DeleteMapping(value = "/deleteid/{id}")
	public String delBank(@PathVariable int id) {
		return bankser.delBank(id);
	}
	@GetMapping(value="/FindBank/{id}")
	public Bank getBank(@PathVariable int id) {
		return bankser.getBank(id);
	}
	
	@GetMapping(value="/FindListid")
	public List<Bank> getListBank() {
		return bankser.getListBank();
	}
	@PutMapping(value = "/updateListBank/{b}")
	public String updateListBank(@RequestBody Bank b){
		return bankser.updateListBank(b);
	}
	@GetMapping(value = "/getIfscbybranch/{branch}")
	public Integer getIfscbybranch(@PathVariable String branch){
		return bankser.getIfscbybranch(branch);
	}
	@GetMapping(value = "/GetAll")
	public List<Bank> getAllUser() {
		return bankser.getAllUser();
	}

}

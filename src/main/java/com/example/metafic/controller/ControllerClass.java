package com.example.metafic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.metafic.entity.EntityClass;
import com.example.metafic.service.ServiceClass;

@RestController
public class ControllerClass {
	@Autowired
	ServiceClass s;
	
	@GetMapping(value = "/printHello")
	public String printHello() {
		return "hello";
	}
	@GetMapping(value = "/sum/{m}/{n}")
	public int sum(@PathVariable int m,@PathVariable int n) {
		return m+n;
	}
	@PostMapping(value = "add")
	public int add(@RequestBody EntityClass ec) {
		return s.add(ec);
	}
	
}

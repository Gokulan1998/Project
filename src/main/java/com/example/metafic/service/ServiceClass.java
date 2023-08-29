package com.example.metafic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.metafic.dao.DaoClass;
import com.example.metafic.entity.EntityClass;

@Service
public class ServiceClass {
	@Autowired
	DaoClass d;
	public int add(EntityClass ec) {
		d.add(ec);
		return ec.getM()+ec.getN();
	}
}

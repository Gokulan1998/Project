package com.example.metafic.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.metafic.entity.EntityClass;
import com.example.metafic.repository.RepoClass;

@Repository
public class DaoClass {
	@Autowired
	RepoClass r;
	public String add(EntityClass ec) {
		r.save(ec);
		return "saved";
	}
	
}
